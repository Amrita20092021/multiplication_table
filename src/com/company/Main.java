package com.company;

import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Vvedi x: ");

        //String str = String.valueOf(number);
        //System.out.println("With valueOf method: string5 = " + str);
//Источник: https://java-blog.ru/osnovy/perevod-int-string-java
        int x = sc.nextInt ();
        System.out.println ();

        System.out.print ("Vvedi f: ");
        int f = sc.nextInt ();
        System.out.println ();

        for (int i = 1; i <= f; i++)
        {				//x+i=y;
            //System.out.println (x * i);
            int rezult = x * i;
            String str = String.valueOf(x);
            String str1 = String.valueOf(i);
            String str2 = String.valueOf(rezult);
            sc.close ();

            System.out.println (""+str+"x"+str1+"="+str2);

//int n = Integer.MAX_VALUE;
            //String str1 = Integer.toString(n);
            //System.out.println("The output string is: " + str1);
//Источник: https://java-blog.ru/osnovy/perevod-int-string-java
        }


    }
}

