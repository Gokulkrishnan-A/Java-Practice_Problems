import java.lang.*;
import java.util.*;


public class possibleWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		System.out.print(getpalindrome(input1));
	}
		public static int getpalindrome(int input1)
		{
		String str=Integer.toString(input1);
		int[] temp=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			temp[i]=str.charAt(i)-'0';
		}
		int l=temp.length;
		int index=-1,flag=0;
		for(int i=0;i<l/2;i++)
		{
	     if(temp[i]!=temp[l-i-1])
		 {
			 if(temp[i]==temp[l-i-2] && ((l-i-2)>=l/2))
			 {
			 index=l-i-1;
			 flag=1;
			 }
			 else if(temp[i+1]==temp[l-i-1] && (i+1<=l/2)){
			 index=i;
			 flag=1;
			}
			 else if(i==0)
			 {
			 index=i;
			 flag=1;
			 }
//			 else if(flag==0 && ((l-i-2)==l/2)||(i+1==l/2)){
//			 index=i;
//		     	 }
		  return temp[index];
		}
		}
	return -1;
	}

}
