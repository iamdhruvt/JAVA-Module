import java.util.Scanner;

class Q13b
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int val=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("The largest number is: "+val);
		
	}
}