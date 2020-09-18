import java.util.Scanner;

class Q18
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int check=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				check=1;
		}
		if(check==1)
		System.out.println("Number is not prime");
		else
		System.out.println("Number is prime");
	}
}