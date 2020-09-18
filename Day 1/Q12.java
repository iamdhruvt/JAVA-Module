import java.util.Scanner;

class Q12
{
	public static void main (String args[])
	{
		double hra=0,da=0,gs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic sal: ");
		int bas=sc.nextInt();
		if(bas<10000)
		{
			hra=0.1*bas;
			da=0.9*bas;
		}
		else if(bas>=10000)
		{
			hra=2000;
			da=0.98*bas;
		}
		gs=bas+hra+da;
		System.out.println("The Gross Salary: "+gs);
	}
}