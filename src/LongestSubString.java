
public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pwwtew";
		 int count=1,max=0,i=0,j=0;
	        for(i=0;i<s.length()-1;i++)
	        {
	            count=1;
	            for(j=i+1;j<s.length()-1;j++)
	            {
	                if(s.charAt(i)==s.charAt(j))
	                   {
	                   break;
	                   }
	                   else
	                   {
	                   count++;
	                   }
	                }
	        if(count>max)
	            max=count;
	        }
	     System.out.print(max);   
	    }
	}