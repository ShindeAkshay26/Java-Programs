import java.util.Scanner;
class Method {

        //using static keyword no need to create a new object to call a method;
   /* static int logic(int a, int b) {
        int res;
        if (a > b) {
            res = a * b;
        } else {
            res = (a * b) * 2;
        }
        return res;
    }
    */
    int logic(int a,int b)
    {
        int res;
        if (a> b) {
            res = a * b;
        } else {
            res = (a * b) * 5;
        }
        return res;

    }


    public static void main(String[] args) {
        int a, b, c;
        int a1, b1, c1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();

        //using static no need to create a new object to call a method;
        /*
        c=logic(a,b);
        System.out.println(c);
        */

        //calling a method by calling a object
        Method obj=new Method();
        c=obj.logic(a,b);
        System.out.println(c);
    }
}