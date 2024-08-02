import java.util.Scanner;
class Fibonacci
{
    static  void fibo(int num)
    {
        int temp=0;
        int f1=0;
        int f2=1;
        for(int i=0;i<num;i++) {
            System.out.print("\t" + f1);

            //swap
            temp = f2 + f1;
            f1 = f2;
            f2 = temp;
        }
    }
    public static void main(String [] args)
    {
        System.out.println("Fibonacci numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();

//
        fibo(num);


    }
}