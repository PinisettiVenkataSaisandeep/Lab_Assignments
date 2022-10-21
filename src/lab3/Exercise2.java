package lab3;
import java.util.Scanner;
public class Exercise2 
	{
		public static String getImage(String str) 
		{
			StringBuffer sb=new StringBuffer(str);
			String s=sb.reverse().toString();
			return s;
		}
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str=sc.nextLine();
			System.out.println(str);
			String str1=getImage(str);				
			System.out.println("Mirror Image: "+str+"|"+str1);
		}
		
		

}