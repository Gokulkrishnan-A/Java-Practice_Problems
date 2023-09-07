import java.util.Arrays;
import java.util.Scanner;

public class movie {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float arr[]=new float[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextFloat();
		}
		//sorting
		Arrays.sort(arr);

		//counting
		int last=n-1,first=0,count=1;
		for(int i=0;last>first;i++)
		{
			if(arr[first]+arr[last]<=3)
			{
				last--;
				first++;
			}
			else
				last--;  	
			count++;
	    }
		System.out.println(count);	
	}
}
