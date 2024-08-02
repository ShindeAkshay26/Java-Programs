class Phone1
{
    public void call()
    {
        System.out.println("Here we calling from the phooone");
    }
    public void radio()
    {
        System.out.println("here we palying radio using phone");
    }
}

class SmartPhone1 extends Phone1
{
    public void call()
    {
        System.out.println("Here we calling from the SmartPhone ooo Yyyyeeeee");
    }

    public void music()
    {
        System.out.println("Here we playing music using smartPhone");
    }
}
public class Dispatch
{
    public static void main(String[] args)
    {
        System.out.println("Here we learn the DYNAMIC METHOD DISPATCH !!!! \n\n");

        Phone1 obj=new SmartPhone1();
        obj.call();
    }
}