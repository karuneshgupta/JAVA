package com.company;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class Selectionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextByte();
        int []arr = new int[size];
        inputArray(arr);
        // 10 9 8  7 6 5 4 3 2 1
        selection_sort(arr);
        printarray(arr);

    }
    private static void selection_sort(int[] arr) {
        for(int i = 0 ; i< arr.length-1 ; i++)
        {
            int min = i;
            for(int j  = i+1 ; j < arr.length  ;j++)
            {
                if (arr[j] < arr[min])
                    min= j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printarray(int[] arr)
    {
        for (int i = 0 ; i <arr.length ;i++)
        {
            System.out.println(arr[i]);
        }
    }

    static void inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array");
        for(int i = 0 ;i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }
    }

}
