
public class user {

	public static String middle(String str) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer();
		int m=str.length();
		if(m%2==0)
		{
			sb.append(str.substring(m/2-1,m/2+1));
		}
		return sb.toString();	}
	
}
