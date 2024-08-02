package com.Q_preap;

import java.util.Scanner;
/* Here we are just divide the array from first index and  assume that the first index was sorted and from the next all are unsorted so
* we compare the next element with sorted array pushing the values */

public class InsertionSort
{
    public static void printarray(int []array)
{
    for(int i=0;i<array.length;i++)
    {
        System.out.println(array[i]);
    }
}
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();

        int [] num=new int[size];
        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt(); //getting array input
        }

        //insertion sorting
        for (int i=1;i<num.length;i++)
        {
            int current =num[i];
            int j=i-1;
            while(j>=0 && current<num[j])
            {
               num[j+1]=num[j];
               j--;
            }
            num[j+1]=current;

        }
        printarray(num);
    }
}
