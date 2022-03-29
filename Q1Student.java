package com.company;

public class Q1Student {
    public static void main(String[] args)

    {
        System.out.println("hello");
        //System.out.println(args.length);
        //for(int i= 0 ; i<args.length; i++)
        //{
        //	System.out.println("arguments are " + args[i] );
        //}

        String name = args[0];
        int roll = Integer.parseInt(args[1]);
        System.out.println(args[0]);
        System.out.println(args[1]);

    }
}
