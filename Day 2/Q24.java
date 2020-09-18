import java.util.Scanner;

class Q24
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
		
		System.out.println("Enter element to be searched: ");
		int src=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==src)
			{
				System.out.println("Element: "+src+" found at "+(i+1)+"th position");
			}
		}
		
		
	}
}