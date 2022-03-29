package com.company;

import java.util.Scanner;

public class Replacing01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        // 1024
       int r = reverse(num);
       int replacedNumber =  reverse(r);
        System.out.println(replacedNumber);


    }

    private static int reverse(int num) {
        int rev= 0;
        while(num!=0)
        {
            int rem = num%10;
            if(rem == 0) {
                rem = 1;
            }
            rev= rev*10 + rem;
            num = num/10;
        }
        return rev;
    }
}
