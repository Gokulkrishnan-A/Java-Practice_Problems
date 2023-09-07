import java.util.Arrays;

public class MODEL {

	public static void main(String[] args) 
		{
			String str="3799945793";
			System.out.println(istrue(str));
		}
		public static String istrue(String str) {
			StringBuffer sb=new StringBuffer();
			int[] arr=new int[str.length()];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=str.charAt(i)-'0';
			}
			Arrays.sort(arr);
			int flag=0,max=0;
			for(int i=arr.length-1;i>0;i--)
			{
				if(arr[i]==arr[i-1] && arr[i]!=0){
				sb.append(arr[i]);
				i--;
				flag=1;
				}
				else if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			if(flag==0) 
				sb.append(arr[arr.length-1]);
			else
			{
				String str1=sb.toString();
				if(sb.length()*2!=arr.length)
				sb.append(max);
				for(int i=str1.length()-1;i>=0;i--)
					sb.append(str1.charAt(i));
			}
			
			return sb.toString();
			
		}
}