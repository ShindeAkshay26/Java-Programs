class Array
{
    public static void main(String []args)
    {
        // Fist way to create array
        //  1. Decleration and memory allocation
       /* int[] mark=new int[5];
        mark[0]=88;
        mark[1]=88;
        mark[2]=84;
        mark[3]=86;
        mark[4]=71;
        System.out.println(mark[1]);
        */

        // Second way to create array
        // 2. decleration and then memory allcation
        /*int[] marks;
        marks=new int[8];
        marks[0]=88;
        marks[1]=88;
        marks[2]=84;
        marks[3]=86;
        marks[4]=80;
        marks[5]=86;
        marks[6]=89;
        marks[7]=90;

        System.out.println(marks[5]);*/

        // third way to create array
        //3 . Decleration , allocation and initilzation in one step

        int[] mark={88,87,86,95,98,71};
        System.out.print(mark.length);
    }
}