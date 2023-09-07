
public class sumofpowerofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=582109;
     String str=Integer.toString(num);
     int[] ans=new int[str.length()];
     for(int i=0;i<str.length();i++)
     {
    	 ans[i]=str.charAt(i)-'0';
     }
     int sum=0;
     
     for(int i=0;i<ans.length;i++)
     {
    	 if(i!=ans.length-1)
    	 {
    		sum+=Math.pow(ans[i],ans[i+1]);
   
    	 }
    	 else
    	 {
    		 sum+=Math.pow(ans[i], i+1);
    		
    	 }
     }
     System.out.println(sum);
     
	}

}
