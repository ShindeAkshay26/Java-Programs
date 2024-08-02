interface mycamera
{
    void takesnap();
    void recordvideo();

    default void recordIN4k()
    {
        System.out.println("Recording in 4k Quality");
    }

}
interface mywifi
{
    String[] mynetworks();
    void connectednetworks(String network);
}
class mycellphone {
    void callnumber(int pnumber) {
        System.out.println("calling a friend" + pnumber);
    }

    void pickcall() {
        System.out.println("connecting..............");
    }

}

class mysmartphone extends mycellphone implements  mycamera, mywifi
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
class Interface_default_method
{
    public static void main(String[] args)
    {
        System.out.println("Java Interface defaults methods \n");

        mysmartphone ms=new mysmartphone();
        String[] arr=ms.mynetworks();
        for (String item:arr) {
            System.out.println(item);
            
        }
        ms.recordIN4k();
    }
}