import java.util.Scanner;

class Q25
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int i;
		System.out.println("Enter 10 elements : ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum_even=0,sum_odd=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum_even=sum_even+arr[i];
			else
				sum_odd=sum_odd+arr[i];
		}
		System.out.println("The sum of even numbers in array: "+sum_even);
		System.out.println("The sum of odd numbers in array: "+sum_odd);

		
	}
}