import java.util.Scanner;

public class emailIdchecker {

	public static void invlaid(String str )
	{
		int index=str.indexOf("@");
		int indexDot=str.indexOf(".");
		StringBuffer ans=new StringBuffer();
		  for(int i=0;i<index;i++)
		  {
		   ans.append(str.charAt(i));
		  }
		  ans.append(":");
		  for(int i=index;i<indexDot;i++)
		  {
			  ans.append(str.charAt(i));
		  }
		  ans.append(":invalid");
		  System.out.println(ans);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner  sc= new Scanner(System.in);
	String str=sc.next();
	int index=str.indexOf("@");
	StringBuffer ans=new StringBuffer();
	 String mail=str.substring(index,str.length());
	if(index>=15)
	{
		invlaid(str);
	}
	else
	{
		for(int i=0;i<str.length();i++)
		{
			if(((str.charAt(i)>58 && str.charAt(i)<47) || (str.charAt(i)<96 && str.charAt(i)>123)) && i<index)
			{ 
				invlaid(str);
				break;
			}
			else if(i==index)
			{
				   if(mail.equals("@gmail.com")|| mail.equals("@yahoo.com") || mail.equals("@wipro.com"))
				{
					for(int k=0;k<index;k++)
					{
						ans.append(str.charAt(k));
					}
					ans.append(":.com:valid");
					System.out.println(ans);
					break;
				}
				else
				{
					invlaid(str);
					break;
				}
		}
	}

	}
	}
}


