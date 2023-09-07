import java.util.Scanner;

public class numberVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc= new Scanner(System.in);
		String num=sc.next();
		int ans=numberValidation.Validate(num);
		if(ans==1)
			System.out.println("Correct number");
		else
			System.out.println("wrong number");
	}

}
