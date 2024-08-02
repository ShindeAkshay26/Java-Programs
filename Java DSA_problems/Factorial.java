import java.util.Scanner;

class Factorial
{
    static int fact_iter(int num)
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

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int num=sc.nextInt();

        System.out.println("Factorial of "+num+" is "+fact_iter(num));

    }

}
