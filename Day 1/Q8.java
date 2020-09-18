import java.util.Scanner;

class Q8{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int princ,time,rate;
		System.out.println("Enter the Principle amount: ");
		princ=sc.nextInt();
		System.out.println("Enter the Rate: ");
		rate=sc.nextInt();
		System.out.println("Enter the duration");
		time=sc.nextInt();
		double si=(princ*rate*time)/100;
		System.out.println("The Simple interest is: "+si);
		
	}
}