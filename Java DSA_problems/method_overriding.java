class A
{
    public void method1()
    {
        System.out.println("It is method1  in the class A");
    }
    public void method2()
    {
        System.out.println("It is method2 from  the class A");
    }
}

class B extends A
{
    @Override
    public void method2()
    {
        System.out.println("\n It is method2 from class B \n ");
    }
    public void method3()
    {
        System.out.println("It is method3 from class B");
    }

}
public class method_overriding
{
    public static void main(String[] args)
    {
        System.out.println("Methods Overriding In java");
//        A a=new A();
//        a.method1();
        B b=new B();
        b.method2();
    }
}