import java.util.Scanner;

class Q17
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int rev=0;
		int copy=num;
		
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("The reversed number: "+rev);
	}
}