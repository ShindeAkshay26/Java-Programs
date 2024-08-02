public class JumpGame
{
    public static void main(String[] args) {

        JumpGame j=new JumpGame();
        int nums[]={2,3,1,1,5};
        System.out.println(j.solution( nums));

    }

    public  boolean solution(int [] nums)
    {
        int n= nums.length;

        if(n==1)
        {
            return true;
        }

        int max=0;
        for(int index=0;index<n-1 && index>=max ;index++)
        {
            if(max<index+nums[index])
            {
                max=index+nums[index];
            }
            if(max>=n-1)
            {
                return true;
            }
        }
        return false;
    }
}
