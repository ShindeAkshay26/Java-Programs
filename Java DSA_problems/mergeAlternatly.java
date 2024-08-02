class mergeAlternatelytest
{
    public String mergeString(String word1,String word2)
    {
        StringBuilder sb=new StringBuilder();
        int l=word1.length();
        int m=word2.length();
        int i=0;
        while(i<l || i<m )
        {
            if(i<l)
            {
                sb.append(word1.charAt(i));
            }
            if(i<m)
            {
                sb.append(word2.charAt(i));
            }
            i++;
        }
    return sb.toString();

    }
}

public class mergeAlternatly{
    public static void main(String[] args) {
        mergeAlternatelytest mg=new mergeAlternatelytest();
        String var= mg.mergeString("abcd","pq");
        System.out.println(var);

    }
}