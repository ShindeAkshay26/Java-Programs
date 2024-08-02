import java.util.Scanner;

class pattern
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        /*
        for(int i=0;i<n;i++)

        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

         */
        for(int i=n;i>=0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}