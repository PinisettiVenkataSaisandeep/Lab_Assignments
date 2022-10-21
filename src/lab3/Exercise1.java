package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter line of space seperated integers");
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," "); 
		int sum=0, i=0;
        String[] s = new String[st.countTokens()];
        System.out.println("displaying integers");
	     while (st.hasMoreTokens()) {   
	         s[i] = st.nextToken();
	         System.out.println(s[i]);
	         sum += Integer.parseInt(s[i]);
	         i++;
	     }
	     System.out.println();
	     System.out.print("sum is ");
	     System.out.println(sum);

	}

}
