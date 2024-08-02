 abstract class parent
{
    void parent()
    {
        System.out.println("I am the constructor of the parent class");
    }

    public void sayhello()
    {
        System.out.println("Say my name you *****er");
    }

    abstract void greet3();
}

class child2 extends parent
{
    @Override
    public void greet3()
    {
        System.out.println("I am  the overidden method ,,,,thats why my class dont need an abstract declaration");
    }
}

 abstract class child3 extends parent
{
    public void Ashly()
    {
        System.out.println("Look At mee.....");
    }
}

class Abstract
{
    public static void main(String[] args)
    {
        System.out.println("Abstract class and Abstract Method in java");
//        parent p=new parent();-----here we cant create an object of an abstract class

        child2 c=new child2(); //we create a obj of its because we not decleare it as a abstract we just override it

      //  child3 c3=new child3(); //-----here we cant create an object of an abstract class

        c.greet3();
        c.sayhello();
    }
}