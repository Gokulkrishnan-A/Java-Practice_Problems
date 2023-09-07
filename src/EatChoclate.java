import java.util.Scanner;

public class EatChoclate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0,ans=0,sum=0;
		if(n==1)
			k=1;
		if(n==2)
			k=2;
		if(n==0)
			k=0;
		if(n>2)
		{
			while(sum!=n) {
			if(sum<n/2)
			{
				ans++;
				sum+=ans;
				k++;
			}
			if(sum==n/2)
			{
				sum+=ans;
				k++;
			}
			if(sum>n/2)
			{
				if(sum==n-1)
				{
					ans=1;}
				else {
					ans--;}
				sum+=ans;
				k++;
				}

			}
		}
		System.out.print(k);
}
}