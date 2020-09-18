import java.util.Scanner;

class Q9
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days: ");
		int days=sc.nextInt();
		System.out.println("Years: "+days/365);
		if(days%365!=0)
		{
			System.out.println("Months: "+(days%365)/31);
			if((days%365)%31!=0)
			{
				System.out.println("Days: "+(days%365)%31);
			}
			else
			{
				System.out.println("Days: 0");
			}			
		}
		else
		{
			System.out.println("Months: 0");
			System.out.println("Days: 0");
		}
		
	}
}