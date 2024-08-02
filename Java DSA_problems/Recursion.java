import java.util.Scanner;
class Recursion
{
   /* static int fact_iter(int num)
    {
        int fact=1;
        int sum;
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
        return fact;

        }
    }

    */

    //Factorial by recursive
    /*
    static  int factorial(int n)

    {
        if(n==0 ||n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
    */
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int num=sc.nextInt();

//        System.out.println("Factorial of "+num+" is "+factorial(num));
    //    System.out.println("Factorial of "+num+" is "+fact_iter(num));
        System.out.println("Sum of first "+ num + " is " +sum(num));


    }
}