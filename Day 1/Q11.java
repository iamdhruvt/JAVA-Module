import java.util.Scanner;

class Q11
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		int a=sc.nextInt();
		System.out.println("Enter B: ");
		int b=sc.nextInt();
		System.out.println("Before Reversing: A="+a+"and B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Reversing: A="+a+"and B="+b);
	}
}