import java.util.Arrays;
import java.util.Scanner;

public class Peru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Scanner sc= new Scanner(System.in);
		int n=110;
		String str=Integer.toString(n);
		int[] arr=new int[10];
		int c=0;
		
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)-'0']++;
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2!=0)
				c++;
		}
		System.out.print(c-1);
		

	}

}
