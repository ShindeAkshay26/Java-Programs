package com.Q_preap;

import java.util.Scanner;

public class TwoDarrays
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int row=sc.nextInt();
        int col=sc.nextInt();
/*
        float f1[] ,f2[];
        f1= new float[10];
        f2=f1;*/

        int[][] nums=new int[row][col];

        System.out.println("Enter the elememts : ");

        //getting input for 2D array

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }



    }
}
