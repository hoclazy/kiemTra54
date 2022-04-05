package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" gia tri cua phan tu: " + (i + 1));
            arr[i] = sc.nextDouble();
        }

        int sum = 0;
        for(int i = 0; i< arr.length; i++) {
            if (arr[i]%2==0) {
                sum = (int) (sum + arr[i]);
            }

        }
        System.out.println(sum);

        System.out.println("nhap a: ");
        int a = sc.nextInt();
        for(int j = 0; j<arr.length;j++) {
            if(a == arr[j]) {
                System.out.println("vi tri cua a trong mang la: " +j);
            }
        }

    }
}
