import java.util.Arrays;
import java.util.Scanner;

public class RotateByOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int size=arr.length;
        for(int i=size-1;i>0;i--)
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
