class phone
{
    public void ringing()
    {
        System.out.println("Your cellphone is ringing");
    }

    public void vibrating()
    {
        System.out.println("Your cellphone is vibrating");
    }
}
public class CellPhone
{
    public static void main(String[] args)
    {

        phone Iphone=new phone();
        Iphone.ringing();
        Iphone.vibrating();
    }
}