
public class SUMOFPRIMEDIGTS {

public static boolean isprime(int num) {
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
			return false;
	}
	if(num==0 ||num==1)
		return false;
	return true;
}
	public static void main(String[] args) {
		
	 int intput=1234561179;
	  String str=Integer.toString(intput);
	  StringBuffer str1=new StringBuffer();
	  int sum=0;
	     int[] ans=new int[str.length()];
	     for(int i=0;i<str.length();i++)
	     {
	    	 ans[i]=str.charAt(i)-'0';	 
	    	 if(isprime(ans[i]))
	    	 {
	    		str1.append(ans[i]);
	    		sum+=ans[i];
	    	 } 
	     }
	     str1.append(":").append(sum);
	     System.out.println(str1);
	}
}


