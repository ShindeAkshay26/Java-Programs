import java.util.Scanner;
class input
{
    public static void main(String [] args)
    {
        System.out.println("Taking Input in java");

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a=s.nextInt();
        System.out.println("Enter the number 2");
        int b=s.nextInt();
        int sum=a+b;
        System.out.println("Sum is :"+sum);


    }
}