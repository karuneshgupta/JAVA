package com.company;

import java.util.Scanner;

public class ZigZag{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("enter size");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ;i< arr.length-1 ;i++)
        {
            if(i%2==0)// even index
            {
                if(arr[i+1] < arr[i])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] =temp;
                }
            }
            else { // odd index
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] =temp;
                }
            }
        }

        System.out.println("zig zag array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }

}
