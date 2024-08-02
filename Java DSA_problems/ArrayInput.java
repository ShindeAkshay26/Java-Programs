package com.Q_preap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayInput
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();

        int numbers[]=new int[size] ;
        System.out.println("enter elements :");
        for(int i=0;i< numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i< numbers.length;i++)
        {
            System.out.print( numbers[i] + " " );
        }
    }
}
