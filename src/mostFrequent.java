import java.util.Scanner;

public class mostFrequent {
	   static int highestFrequency(int[] input1, int input2) {
			// TODO Auto-generated method stub
		   int[] arr=new int[10];
		   int max=0,k=0,maxEle=0;
		   for(int i=0;i<input2;i++) {
			   while(input1[i]!=0)
			   {
				   arr[input1[i]%10]++;
				   input1[i]/=10;   
			   }
		   }
		   
		   for(k=0;k<10;k++)
		   {
			   if(arr[k]>max)
			   {
				   max=arr[k];
			       maxEle=k;
			       
			   }     
		   }
			
			return maxEle;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input2=sc.nextInt();
		int input1[]=new int[input2];
		for(int i=0;i<input2;i++)
		{
			input1[i]=sc.nextInt();
		}
		System.out.print(highestFrequency(input1,input2));		
		
	}

	

}
