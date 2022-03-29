package com.company;

import java.util.Scanner;

public class Friendlypairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1 =  sc.nextByte();
        int num2 = sc.nextByte();

        boolean resultnum1 = friendpair(num1);
        boolean resultnum2 = friendpair(num2);

        if(resultnum1 == true && resultnum2 == true)
        {
            System.out.printf("numbers %d %d are friendly pairs" , num1 ,num2);
        }
        else
            System.out.println("not friendly pairs");
    }

   private static boolean friendpair(int num ){
        // 6
        int sum = 0;
        for(int i = 1 ; i<= num/2 ; i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }

        return(sum == num);
    }

}
