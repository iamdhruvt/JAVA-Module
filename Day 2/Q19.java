import java.util.Scanner;

class Q19
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number till which you want the series: ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i*i;
		}
		System.out.println("Sum of series: "+sum);
		
	}
}