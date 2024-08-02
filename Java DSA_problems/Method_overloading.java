class Method_overloading
{
    static void example()
    {
        System.out.println("Its a method with no argument ");
    }

    static void example(int a)
    {
        System.out.println("It is a same method with one parameter a and its value is :"+a);
    }

    static void example(int a,int b)
    {
        System.out.println("its another method with same name and different arguments and its val is :"+a+"\t\t"+b);
    }


    public static void main(String [] args)
    {
        System.out.println("!! Method overloading !!");

        example();
        example(200);
        example(300,210);
        // Arguments are actual values and the parameter is a reference of a variable
    }

}