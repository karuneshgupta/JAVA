package com.company;
import java.util.Scanner;
import static java.lang.Math.*;

public class Deposit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Term deposit \n 2-Recurring deposit\n");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1 :
            {
                System.out.println("enter amount,rate of interest and time\n");
                int principleAmount = sc.nextInt();
                float rate = sc.nextFloat();
                int time = sc.nextInt();
                double power = pow(0.01*(1+rate),time);
                System.out.println(principleAmount*power);
                break;
            }

            case 2:
            {
                System.out.println("enter monthly installment ,rate of interest and time in months\n");
                int principleAmount = sc.nextInt();
                float rate = sc.nextFloat();
                int time = sc.nextInt();
                double rd = ( (principleAmount * time ) + (principleAmount*(time*(time+1)) /2.0) * (0.01*rate * 1/12) );
                System.out.println(rd);
              break;
            }

        }
    }

}
