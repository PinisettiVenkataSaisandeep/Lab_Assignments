package lab1;

import java.util.Scanner;

public class Exercise3 {
	
	public static int fibanocciNonRecursive(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		while(n>2) {
			nth_term = term1 + term2;
			term1 = term2;
			term2 = nth_term;
			n--;
		}
		return nth_term;
	}
	
	public static int fibanocciRecursive(int n) {
		if(n>0) {
			nth_term = temp1 + temp2;
			temp1 = temp2;
			temp2 = nth_term;
			fibanocciRecursive(n-1);
		}
		return nth_term;
	}
	
	static int term1 = 1, term2 = 1, nth_term, temp1=term1, temp2=term2;
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter number of terms");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("The nth Term using non-recursive method is");
		System.out.println(fibanocciNonRecursive(num));
		System.out.println("The nth Term using recursive method is");
		System.out.println(fibanocciRecursive(num-2));
	}
}




/*static int a = 0, b = 1, nextTerm;
//public static void main (String[]args)
{

  int n = 15;
  // Here we are printing 0th and 1st terms
    System.out.print (a + " , " + b + " , ");

  // n-2 as 2 terms already printed
    Fib (n - 2);
}

static int Fib (int n)
{
  if (n > 0)
    {
   nextTerm = a + b;
   a = b;
   b = nextTerm;

   System.out.print (nextTerm + " , ");
   Fib (n - 1);
    }
  return 0;

}*/

