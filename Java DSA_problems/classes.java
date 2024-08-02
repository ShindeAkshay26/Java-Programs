import org.w3c.dom.ls.LSOutput;

class employee
{
    int id;
    String name;
    int salary;

    public void emp()
    {
        System.out.println("My id is : "+id+" my name is  :"+name);
    }

    public int getSalary()
    {
        return salary;
    }
}
public class classes
{
    public static void main(String[] args)
    {
        System.out.println("This is our cusotm  class");
        employee ak=new employee();
        ak.id=12;
        ak.salary=54000;
        ak.name="Akshay shinde";

        employee ck=new employee();
        ck.id=13;
        ck.salary=80000;
        ck.name="cellian murphy";

        employee rdj=new employee();
        rdj.id=42;
        rdj.salary=150000;
        rdj.name="Robert douny juniar";

//        ak.emp();
//        ck.emp();
//        rdj.emp();

        System.out.println("Your salary is "+ak.getSalary()+" Credited in your account");
        System.out.println("Your salary is "+ck.getSalary()+" Credited in your account");
        System.out.println("Your salary is "+rdj.getSalary()+" Credited in your account");



//        System.out.println("my id is :"+ak.id+" My name is :"+ak.name);
    }
}