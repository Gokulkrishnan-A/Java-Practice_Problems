
public class findstringcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write code here...
		 String input1="World Wide Web";
				String[] str=input1.split(" ");
				StringBuffer sb=new StringBuffer();

				for(int i=0;i<str.length;i++)
				{
					String name=str[i];
					name=name.toLowerCase();
					int l=0,sum=0,j=0;
					l=name.length()/2;
					for(j=0;j<l;j++)
					{
		               sum+=Math.abs((int)(name.charAt(j))-((int)name.charAt(name.length()-j-1)));
					}
					 if(name.length()%2==1){
					    sum+=(int)(name.charAt(j))-96;
					 }
					sb.append(sum);
				}
				System.out.println(Integer.valueOf(sb.toString()));
//			  return Integer.valueOf(sb.toString()); 
			}
		}
