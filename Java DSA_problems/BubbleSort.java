package com.Q_preap;

import java.util.Scanner;

/*In bubble sort we just find the max num and compare it to its next element
   and if it big so we replace it and by this we place the max element at last index */

public class BubbleSort
{

    public static void printarray(int []array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();

        int [] num=new int[size];
        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt(); //getting array input
        }

        // Bubble sorting
        int max=0;
        for(int i=0;i< num.length-1;i++)
        {
           for(int j=0;j< num.length-i-1;j++)
           {

               if(num[j]>num[j+1]) {
                   //swapping
                   int temp = num[j];
                   num[j] = num[j + 1];
                   num[j + 1] = temp;

               }
           }
        }

        printarray(num);

    }
}
