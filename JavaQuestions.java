package com.company;
import java.util.Scanner;
public class JavaQuestions {

    public static void main(String[] args) {

        //checkPrime();
        //armstrong();
        //reverseNum();
        //evenOdd();
       // largest_Among_4();
       // transpose();
      //sum_row_column();

    }

    private static void sum_row_column() {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter size of array ");
        size = sc.nextInt();
        int [][] array = new int[size][size];
        inputarr(array,size);
        int row_sum = 0;
        System.out.println("row_sum");
        for(int i = 0 ;i<size ;i++) {
            int rowSum = 0;
            int j;
            for (j = 0; j < size; j++) {
                rowSum += array[i][j];
            }
            System.out.printf("row %d sum = %d \n", i+1, rowSum);
        }
        System.out.println("Column sum");
        int column_sum = 0 ;
        for(int i = 0 ;i<size ;i++) {
            column_sum = 0;
            int j;
            for (j = 0; j < size; j++) {
                column_sum += array[j][i];
            }
            System.out.printf("column %d sum = %d \n", i+1, column_sum);
        }
    }
    private static void inputarr(int[][] arr, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements ");
        for(int i = 0 ; i< size;i++)
        {
            for(int j = 0 ; j<size ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

    }

    private static void transpose() {

        Scanner sc = new Scanner(System.in);
        int [][]originalArr = new int[3][3];
        int [][]transposeArr = new int[3][3];

        System.out.println("enter array elements ");
        for(int i = 0 ; i< originalArr.length;i++)
        {
            for(int j = 0 ; j<originalArr.length ; j++)
            {
                originalArr[i][j] = sc.nextInt();
                transposeArr[j][i]= originalArr[i][j];
            }
        }
        for(int i = 0 ; i< transposeArr.length;i++)
        {
            for(int j = 0 ; j<transposeArr.length ; j++)
            {
                System.out.print(transposeArr[i][j]);
            }
            System.out.println();
        }




    }

    private static void largest_Among_4() {
        Scanner sc = new Scanner(System.in);
        int n, t;
        System.out.println("enter number of test cases ");
        t = sc.nextInt();
        int[] array = new int[4];
        while (t != 0) {
            System.out.println("enter elements");
            for(int i = 0 ;i<array.length ; i++)
            {
                array[i] = sc.nextInt();
            }
            int largest = array[0];

            for (int j : array) {
                if (j > largest) {
                    largest = j;
                }
            }
            System.out.println("largest number is " + largest);


            t--;
        }
    }

    private static void evenOdd() {
        Scanner scan = new Scanner(System.in);
        int n, t;
        System.out.println("enter number of test cases ");
        t = scan.nextInt();
        while (t != 0) {
            System.out.println("enter a number");
            n = scan.nextInt();

            if(n%2 == 0){
                System.out.println("even number");
            } else{
                System.out.println("odd");
            }

            t--;
        }
    }


    private static void reverseNum() {

        Scanner scan = new Scanner(System.in);
        int n, t;
        System.out.println("enter number of test cases ");
        t = scan.nextInt();
        while (t != 0) {
            System.out.println("enter a number");
            n = scan.nextInt();
            int rem , rev= 0;
            while(n!=0)
            {
                rem = n%10;
                rev = rev * 10 +rem;
                n = n/10;
            }
            System.out.println("the reversed number is " + rev);


            t--;
        }
    }

    private static void armstrong() {
        Scanner scan = new Scanner(System.in);
        int n, t;
        System.out.println("enter number of test cases ");
        t = scan.nextInt();
        while (t != 0) {
            System.out.println("enter a number");
            n = scan.nextInt();

            int num = n, sum = 0, rem;
            while (num != 0) {
                rem = num % 10;
                sum = sum + (rem *rem*rem);
                num = num / 10;
            }
            if (sum == n) {
                System.out.println(n + " is an armstrong number");
            }
            else{
                System.out.println("it is not an armstrong number");
            }


            t--;
        }
    }

    public static void checkPrime() {
        Scanner scan = new Scanner(System.in);

        int n, t;
        System.out.println("enter number of test cases ");
        t = scan.nextInt();
        int flag = 0;
        while (t != 0) {
            System.out.println("enter a number");
            n = scan.nextInt();
            flag = 0;
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + " is a prime number ");
            } else {
                System.out.println("it is not a prime number");
            }
            t--;
        }

    }
}

