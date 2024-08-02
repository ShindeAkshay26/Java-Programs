package com.Q_preap;

import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int num[][]=new int[row][col];

        System.out.println("Enter elements :");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a element to found :");
        int x=sc.nextInt();

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if (num[i][j]==x)
                {
                    System.out.println(x + "found at position : " + i + " "+ j);
                }
            }
        }

    }
}
