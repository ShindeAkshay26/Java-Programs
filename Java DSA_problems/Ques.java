package com.Q_preap;

import java.util.Scanner;

public class Ques
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
        System.out.println("Enter a element to find :");
        int element=sc.nextInt();
        for(int i=0;i< numbers.length;i++)
        {
            if(numbers[i]==element)
            {
                System.out.println(element + " found at index " +i);
            }

        }
    }
}
