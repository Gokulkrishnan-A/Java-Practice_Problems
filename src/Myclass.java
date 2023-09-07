import java.util.*;


public class Myclass{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String ipt = sc.next();
    int v=0,c=0;
    for(int i=0;i<ipt.length();i++)
    {
      if(ipt.charAt(i)>='A'&& ipt.charAt(i)<='Z' || ipt.charAt(i)>='a' && ipt.charAt(i)<='z')
      {
        if(ipt.charAt(i)=='a' || ipt.charAt(i)=='A' || ipt.charAt(i)=='e' || ipt.charAt(i)=='E' || ipt.charAt(i)=='i'|| ipt.charAt(i)=='I' || ipt.charAt(i)=='o' || ipt.charAt(i)=='O'|| ipt.charAt(i)=='u' || ipt.charAt(i)=='U')
          v++;
        else
          c++;
      }
    }
    System.out.println("Number of Vowels " + v);
    System.out.println("Number of Consontans " + c);
  }
  }
    