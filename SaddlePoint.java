package com.company;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n = sc.nextInt();
        int [][]matrix = new int[n][n];
        System.out.println("enter elements ");
        for(int i = 0 ; i< n  ;i++)
        {
            for(int j = 0; j< n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }


        int [] min =  new int [n];
        int[]max = new int[n];
        int k = 0;
        for(int i =0 ;i<n ;i++)
        {
            int min_element = matrix[i][0];
            for (int j = 0; j <n ; j++)
            {
                if(matrix[i][j] < min_element )
                    min_element = matrix[i][j];
            }
            min[k++] = min_element;
        }
        k =0;
        for(int i =0 ;i<n ;i++)
        {
            int max_element = matrix[0][i];
            for (int j = 0; j <n ; j++) {

                if(matrix[j][i] > max_element )
                    max_element = matrix[j][i];
            }
            max[k++] = max_element;
        }

int flag = 0 ;
        int saddle=0;
        for (int i = 0; i < n; i++) {
                int temp = min[i];
            for (int j = 0; j < n; j++) {
                if(max[j] == temp)
                {
                     saddle = temp;
                    flag = 1 ; // saddle point found
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Saddle Point :" + saddle);
        }
        else{
            System.out.println("Saddle Not found");
        }

    }
}
