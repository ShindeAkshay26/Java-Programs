public class ComonSubSequence
{
    public static void main(String[] args)
    {
        String[] str={"file","find","fight","fill"};
        System.out.println(solution(str));
    }

    public static String solution(String []str)
    {
        if(str.length==0) return "";
        String prefix=str[0];
        for(int i=1;i< str.length;i++)
        {
            while(str[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
