import java.util.Scanner;

class Q13a
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a :"+a+" is largest");
			}
			else
			{
				System.out.println("c: "+c+" is largest");
			}
		}
		else if(b>c)
			System.out.println("b: "+b+" is largest");
		else
			System.out.println("c: "+c+" is largest");
	}
}