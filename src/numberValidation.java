public class numberValidation {

	public static int Validate(String num){
		// TODO Auto-generated method stub
		int a;
		    if(num.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
		    a= 1;
		    else
		     a=0;
		   return a;
		}
		
	}
