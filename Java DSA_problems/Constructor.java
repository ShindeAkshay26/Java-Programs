
class Myemployee
{
    int id;
    String name;
    // here using the method overiding on the constructor
    public Myemployee()
    {
        id=45;
        name="Akshay";
    }
    public Myemployee(String na,int ID)
    {
        id=ID;
        name=na;
    }

    public void setid(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String nam)
    {
        name=nam;
    }
    public String getname()
    {
        return name;
    }
}
public class Constructor
{
    public static void main(String[] args) {
        System.out.println("Constructor on java ");
        Myemployee emp2=new Myemployee();
        Myemployee emp1=new Myemployee("Akshay Shinde",236253);
//        emp1.setid(45);
//        emp1.setName("Akshay");
        System.out.println("Your id :"+  emp1.getId() +" And your name is "+ emp1.getname());
        System.out.println("Your id :"+  emp2.getId() +" And your name is "+ emp2.getname());

    }
}