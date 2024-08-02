class base
{
    public base()
    {
        System.out.println("I am the Constructor of BASE  class"+"\n And \n");
    }
     public base(int x)
     {
         System.out.println("I am a Overloaded Constructor with a as :"+x);
     }
}

class derived1 extends base
{
    public derived1()
    {
//        super(10);
        System.out.println("I am the constructor of Derived Class From the base class ");
    }
    public derived1(int x,int y)
    {
        super(x);
        System.out.println("I am the overloaded constructor of Derived Class From the base class "+y);
    }
}

class child extends derived1
{
    public child()
    {
        System.out.println("I am  the child class ");

    }
    public child(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am the overloaded child class with val "+z);
    }
}

public class constructor_inheritance
{
    public static void main(String[] args)
    {
        System.out.println("Inheritance through the java :\n\n");
//       base B=new base();
//        derived1 D=new derived1();
        child C=new child();

    }
}