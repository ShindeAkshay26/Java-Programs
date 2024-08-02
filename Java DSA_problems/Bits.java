package com.Q_preap;

import java.util.Scanner;

public class Bits
{
    public static void main(String[] args) {
        /*  //using Bit And operation
        int n=5; //0101

        int pos=3;

        //BitMask Working
        int bitMask=1<<pos;

        if((bitMask & n)==0)
        {
            System.out.println("Bit was Zero ");
        }
        else
        {
            System.out.println("Bit was One");
        }
        */


        //bitMask for Bit Or in which we perform bit OR operation
        /*
        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);

         */
        //clear bit --- in which we perform AND with NOT
        //first apply not on  1 bitmask and then AND with given number
/*
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notBitMask=~bitMask;

        int newNumber=notBitMask & n;
        System.out.println(newNumber);

 */
        //update bit -- in which we perform two operation or cases
        //case 1--AND with NOT  and case 2--  OR operation
        Scanner sc=new Scanner(System.in);
        int opre=sc.nextInt();

        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        if(opre==1)
        {
            //set
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }
        else {

            int newbitMask=~(bitMask);
            int newNumber=newbitMask;
            System.out.println(newNumber);

        }

    }
}
