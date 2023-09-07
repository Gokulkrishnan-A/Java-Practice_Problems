import java.util.Scanner;

public class weightofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int input=sc.nextInt();
		str=str.toLowerCase();
		int ans=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '|| str.charAt(i)=='!')
				continue;
			else if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
			{
				if(input==1)
				 ans+=str.charAt(i)-'a'+1;
				else
					continue;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				 ans+=str.charAt(i)-'a'+1;
			else
				continue;
		}
		System.out.println(ans);		
	}

}
