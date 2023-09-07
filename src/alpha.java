
public class alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UserMainCode("12B3A4NGALORE "));
		
	}

	public static String UserMainCode(String input1) {
		// TODO Auto-generated method stub
		int sum=0;
		StringBuffer ala=new StringBuffer();
		StringBuffer out=new StringBuffer();
		for(int i=0;i<input1.length();i++)
		{
			if(Character.isAlphabetic(input1.charAt(i)))
				ala.append(input1.charAt(i));
			else
				sum+=input1.charAt(i)-'0';
		}
		out.append(ala.length()).append(ala).append(sum);
		if(ala.length() ==0 || sum==0)
			return "ZERO";
		else
			return out.toString();
	}

}
