class side
{
    int side;

    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;

    }
}
public class practice_1
{
    public static void main(String[] args)
    {
        System.out.println("Area and perimeter of the Square");

        side sq=new side();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter() );
    }
}