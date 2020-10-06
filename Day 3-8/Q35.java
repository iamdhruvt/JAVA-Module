import java.util.Scanner;
class MathOperation
{
	 static int add(int a,int b){
		return a+b;
	}
	 static int subtract(int a, int b){
		return a-b;
	}
	 static int multiply(int a, int b){
		return a*b;
	}
	 static double power(double a, double b){
		return (Math.pow(a,b));
	}

}

class Demo{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(MathOperation.add(a,b));
		System.out.println(MathOperation.subtract(a,b));
		System.out.println(MathOperation.multiply(a,b));
		System.out.println(MathOperation.power(a,b));

	}
}