import java.util.Scanner;

class Q13c
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("A:"+a+" is the largest");
		else if(b>a && b>c)
			System.out.println("B:"+b+" is the largest");
		else
			System.out.println("C:"+c+" is the largest");
	}
}