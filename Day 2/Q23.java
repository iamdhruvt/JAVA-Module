import java.util.Scanner;

class Q23
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,4,2,3,9,6,7,5,8,10};
		System.out.println("The array : ");
		for(int i: arr)
		{
			System.out.println(i);
		}
		
		System.out.println("Reverse Order: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}