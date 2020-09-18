import java.util.Scanner;

class Q15
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gender: ");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(gender=='M'||gender=='m' && age>=21)
			System.out.println("Eligible to get married");
		else if(gender=='F'||gender=='f' && age>=18)
			System.out.println("Eligible to get married");
		else
			System.out.println("Not eligible");
		
	}
}