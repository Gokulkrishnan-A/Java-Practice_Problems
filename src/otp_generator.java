import java.math.BigInteger;
import java.util.Arrays;

public class otp_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
int[] arr=new int[]{35,65448,8085551,319};
String ans=new String();
String ans1=new String();
String ans3=new String();
int min1=100;
int min2=1000;
int min3=10;
int max=0;
StringBuffer buff=new StringBuffer();
StringBuffer buff1=new StringBuffer();

		for(int i=0;i<arr.length;i++)
		{
			int num=(arr[i]);
			String str=Integer.toString(num);
			int[] temp=new int[str.length()];
			for(int k=0;k<str.length();k++)
			{
				temp[k]=str.charAt(k)-'0';
			}
			for(int m=0;m<temp.length-1;m++)
			{
				ans=String.valueOf(temp[m])+String.valueOf(temp[m+1]);
				
				if((Integer.parseInt(ans)<min1) && (ans!="0"))
				{
					min1=Integer.parseInt(ans);
					ans="0";
				}
			}
			
			for(int m=0;m<temp.length-2;m++)
			{
				ans1=String.valueOf(temp[m])+String.valueOf(temp[m+1])+String.valueOf(temp[m+2]);
				if((Integer.parseInt(ans1)<min2) && (ans1!="0"))
				{
					min2=Integer.parseInt(ans1);
					ans1="0";
				}
			}
			for(int m=0;m<temp.length;m++)
			{
				ans3=String.valueOf(temp[m]);
				if((Integer.parseInt(ans3)<min3) && (ans3!="0"))
				{
					min3=Integer.parseInt(ans3);
					ans3="0";
				}
				if((Integer.parseInt(ans3)>max) && (ans3!="0"))
				{
					max=Integer.parseInt(ans3);
					ans3="0";
				}
			}
		}
		buff.append(min1).append(min2).append(min3+max);
		System.out.println(Integer.parseInt(buff.toString()));



	}

}
