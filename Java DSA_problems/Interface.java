interface bicycle
{
    int a=20;
    void applyBreak(int decreament);
    void speedUp(int increnment);
}

interface horn
{
    void blowHorn();
    void blogHorn();
}

class Operatoin_cycle implements bicycle ,horn
{
    public void applyBreak(int decrement)
    {
        System.out.println("Now your speed is decreases by "+decrement);
    }

    public void speedUp(int increment)
    {
        System.out.println("Now your speed is increased by "+increment);
    }
    public void blowHorn()
    {
        System.out.println("Chal hattt ******");
    }

    public void blogHorn()
    {
        System.out.println("...........Slience");
    }
}
class Interface
{
    public static void main(String[] args)
    {
        System.out.println("We are learning here Interfaec in java");
        Operatoin_cycle op=new Operatoin_cycle();
        op.applyBreak(50);
        op.speedUp(25);
        System.out.println(op.a);//you can create the properties in interface
//        op.a=456;
//        System.out.println(op.a);//you cannot assign "a" here  because in interface defined value is final
        op.blowHorn();
        op.blogHorn();
    }
}