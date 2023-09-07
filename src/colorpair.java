import java.util.Scanner;

public class colorpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		int[] arr=new int[n];
		int[] ans=new int[101];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			ans[arr[i]]++;
		}
		for(int i=0;i<101;i++)
		{
		 res=res+ans[i]/2;	
		}
		System.out.println(res);
	}

}
