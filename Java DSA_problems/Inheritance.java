import java.util.*;
class basic
{
    int x;
    public void setx(int n)
    {
        x=n;
    }

    public int getx()
    {
        return x;
    }
}

class derived extends basic
{
    String name;
    public void  setname(String na)
    {
        name=na;
    }

    public String  getname()
    {
        return name;
    }

}
public class Inheritance
{
    public static void main(String[] args)
    {

        System.out.println("Here is example of inheritance ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id :");
        int y=sc.nextInt();
        System.out.println("Enter your name :");
        String n=sc.next();

//        basic b=new basic();
//        b.setx(y);
//        System.out.println("Your id :"+b.getx());

        derived d=new derived();
        d.setx(y);
        d.setname(n);
        System.out.println("Your id :"+d.getx()+" Verified ,"+" Plese welcome the one and only  "+d.getname()+" Master of Mern Stack !!!");

    }
}