class VarArg
{
    //we passes multiple arguments in the from of arrar
    static int sum(int ...arr)
    {
        int result=0;
        for (int a:arr)
        {
            result+=a;
        }

        return result;
    }

    public static void main(String []args)
    {
        System.out.println("When we passes nothing in arguments :"+sum());
        System.out.println("When we passes one arguments :"+sum(6));
        System.out.println("When we passes two arguments :"+sum(1,9));
        System.out.println("When we passes three arguments :"+sum(1,2,6));


    }
}