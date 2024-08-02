import java.util.Scanner;

import java.util.*;

public class Swapping
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Element before swapping"+a+" "+b);

        // Logic 1   --With the use of third variable
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After Swapping by using third variable :"+a+" "+b);

        // Logic 2  --without third variable by use + -

//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("After Swapping by using + and - operator :"+a+" "+b);

        //Logic 3--  by using multiplication and division
        //there will be not have any 0 value from a and b
//        a=a*b;
//        b=a/b;
//        a=a/b;
//        System.out.println("After Swapping by using * and / operator :"+a+" "+b);

        //logic 4 --by using bitwise operator
        //XOR operator
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println("After Swapping by using Bitwiae XOR operator :"+a+" "+b);

        //logic 5 --  by using single statement
        b=a+b-(a=b);
        System.out.println("After Swapping by using + and - operator :"+a+" "+b);
    }
}
