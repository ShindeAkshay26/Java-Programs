interface mycamera2
{
    void takesnap();
    void recordvideo();

    default void recordIN4k()
    {
        System.out.println("Recording in 4k Quality");
    }

}
interface mywifi2
{
    String[] mynetworks();
    void connectednetworks(String network);
}
class mycellphone2 {
    void callnumber(int pnumber) {
        System.out.println("calling a friend" + pnumber);
    }

    void pickcall() {
        System.out.println("connecting..............");
    }

}

class mysmartphone2 extends mycellphone2 implements  mycamera2, mywifi2
{

    public void takesnap()
    {
        System.out.println("taking a snap");
    }

    public void recordvideo()
    {
        System.out.println("recording a video..");
    }

    public String[] mynetworks()
    {
        System.out.println("Your networks \n");
        String[] mynetworks={"Aritel Fiber","Jio Fiber","BSNL","VodaPhone"};
        return mynetworks;
    }

    public void connectednetworks(String network)
    {
        System.out.println("Connected to "+network);
    }
}
class Polymorphism_interface
{
    public static void main(String[] args) {
        System.out.println("Polymorphism through the interface in  java");

        mycamera2 myc=new mysmartphone2();
        myc.recordIN4k();
       // myc.mynetworks2();//not allowed cause we give the reference of mycamera2 interface
    }
}