
//It just gives you the count of original numbers

public class removeDublicates {
    public static void main(String[] args) {

        int nums[]={1,1,3,6,9};
        System.out.println(removeDubli(nums));
    }

    public static int removeDubli(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length ;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                continue;
            }
            else {
                nums[count]=nums[i];
                count++;
            }
        }

        return count;
    }
}
