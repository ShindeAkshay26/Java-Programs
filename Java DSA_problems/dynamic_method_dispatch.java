class Phone
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

class SmartPhone extends Phone
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
public class dynamic_method_dispatch
{
    public static void main(String[] args)
    {
        System.out.println("Here we learn the DYNAMIC METHOD DISPATCH !!!! \n\n");
        Phone obj=new SmartPhone();
        obj.call();
        obj.radio();
            }
}