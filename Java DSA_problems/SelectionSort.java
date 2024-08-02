package com.Q_preap;

import java.util.Scanner;

/*In selection sort we find the minimum number from the array and place it into the starting index*/

public class SelectionSort
{
    public static void printarray(int []array)
    {   for(int i=0;i<array.length;i++)
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

        //selection sorting
        for(int i=0;i<num.length-1;i++)
        {
            int small=i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[small]>num[j])
                {
                    small=j;
                }
            }
            int temp=num[small];
            num[small]=num[i];
            num[i]=temp;
        }
        printarray(num);
    }
}
