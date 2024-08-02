class arr
{
    public static void main(String args[])
    {
        System.out.println("!! Multi Dimentional Array !!");
        int[][] flats;
        flats = new int[2][3];
        int[][] flat={{101,102,103},{201,202,203}};

        for (int i=0; i<flat.length;i++)
        {
            for (int j=0;j<flat[i].length;j++)
            {
                System.out.print("\t"+flat[i][j]);

            }
            System.out.print("\n");
        }

    }
}