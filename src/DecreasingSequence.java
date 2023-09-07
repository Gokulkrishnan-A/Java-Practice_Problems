import java.util.Arrays;
import java.util.Scanner;

public class DecreasingSequence {
//public final int output1;
//public final int output2;
//	public Result(int out1,int out2) {
//		output1=out1;
//		output2=out2;
//	}
//	
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int int1=sc.nextInt();
			int int2=sc.nextInt();
			int int3=sc.nextInt();
			int sum=array(int1)+array(int2)+array(int3);
			System.out.print(sum);
			
}
	public static int array(int num) {
		String str=Integer.toString(num);
		int[] arr= new int[str.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=str.charAt(i)-'0';
		}
		Arrays.sort(arr);
	    int ans=100*arr[0]+10*arr[1]+arr[2];
	    return ans;
	}
		
}
