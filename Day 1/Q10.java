import java.util.Scanner;

class Q10
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Farhenheit: ");
		double f=sc.nextDouble();
		double c=5*(f-32)/9;
		System.out.println("Temperature in Celsius: "+c);
	}
}