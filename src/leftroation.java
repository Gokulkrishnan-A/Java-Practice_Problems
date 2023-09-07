import java.util.Arrays;
import java.util.Scanner;

public class leftroation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); 
        int n, k, first=0,j=0;
		n=sc.nextInt();
		k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        for(int i=0;i<k;i++)
        {
        	first=arr[0];
        	for(j=0 ;j<n-1;j++) {
        		arr[j]=arr[j+1];}
        	arr[j]=first;
        }
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i]);
        }
	}

}
