class emp
{
    int salary;
    String name;

    public String getname()
    {
        return name;
    }

    public int getsalary()
    {
        return salary;
    }

    public void setname(String str)
    {
        name=str;
    }

    public void setalary(int sal)
    {
        salary=sal;
    }
}
public class example
{
    public static void main(String []args)
    {
        System.out.println("Here  is the practice questions output ::");

        emp harry=new emp();
        harry.setname("Code with harry");
        harry.setalary(213200);
        System.out.println("Your working youtube channel name is "+harry.getname()+" And your first salary will be more than "+harry.getsalary());

    }

}