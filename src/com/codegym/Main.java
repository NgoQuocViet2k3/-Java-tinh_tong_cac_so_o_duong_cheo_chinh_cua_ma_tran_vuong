package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của ma trận: ");
        int size = sc.nextInt();
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.printf("Nhập phần tử tại hàng %d, cột %d: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma trận: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.printf("%d  ", elem);
            }
            System.out.println();
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++){
            mainDiagonalSum += arr[i][i];
        }
        System.out.printf("Tổng trên đường chéo chính của ma trận: %d\n",mainDiagonalSum);

    }
}
