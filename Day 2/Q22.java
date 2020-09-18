import java.util.Scanner;

class Q22
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
		for( int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Descending Order: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}