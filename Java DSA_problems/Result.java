import java.util.Scanner;
class Result
{
    public static void main(String [] args)
    {
        int marathi,english,math,physics,chemistry,environment,biology;
        Scanner mark=new Scanner(System.in);
        System.out.print("Enter the marks of Marathi :");
        marathi=mark.nextInt();
        System.out.print("\n Enter the marks of English :");
        english=mark.nextInt();
        System.out.print("\n Enter the marks of Math :");
        math=mark.nextInt();
        System.out.print("\n Enter the marks of Physics :");
        physics=mark.nextInt();
        System.out.print("\n Enter the marks of Chemistry :");
        chemistry=mark.nextInt();
        System.out.print("\n Enter the marks of Biology :");
        biology=mark.nextInt();
        System.out.print("\n Enter the marks of Environment :");
        environment=mark.nextInt();

        int total=marathi+english+math+physics+chemistry+environment+biology;
        double RESULT=total/6.50;

        System.out.print("\n\n  Total Percentage is :"+RESULT);

    }




}