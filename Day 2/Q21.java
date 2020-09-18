import java.util.Scanner;

class Q21
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter numbers: ");
		int sum=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum of elements is: "+sum);
		System.out.println("The average of elements is: "+(sum/10));
		
	}
}