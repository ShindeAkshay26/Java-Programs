class Array1
{
    public static void main(String [] args)
    {
        int[] mark={81,91,87,69,85,78};
        float[] marks={89.5f,71.0f,78.9f,74,85.2f,82.15f};
        String[] student={"Omkar","Avi","Krushna","Sachin","Suraj","Akshay"};
        /*
        System.out.println("Percentage of "+student[0]+" ="+marks[0]);
        System.out.println("Percentage of "+student[1]+" ="+marks[1]);
        System.out.println("Percentage of "+student[2]+" ="+marks[2]);
        System.out.println("Percentage of "+student[3]+" ="+marks[3]);
        System.out.println("Percentage of "+student[4]+" ="+marks[4]);
        System.out.println("Percentage of "+student[5]+" ="+marks[5]);
        */

        //printing in same order
        System.out.println("Array in Ascending order :");
        for (int i=0;i< mark.length;i++)
        {
            System.out.print("\t"+mark[i]);
        }
        System.out.println("\n Reverse array :");
        //printring in reverse order
        for (int i= marks.length-1;i>=0;i--)
        {
            System.out.print(" \t"+mark[i]);
        }

        System.out.println("\n Array using For-Each loop:");

        // Traversing a array using foe-each loop which introduce in new version of  java

        for (int element:mark)
        {
            System.out.print("\t\t"+element);
        }

    }
}