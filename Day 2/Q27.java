import java.util.Scanner;

class Q27
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int i,j;
		System.out.println("Enter elements: ");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<10;i++)
		{
			for(j=i;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Smallest element: "+arr[0]);
		System.out.println("Largest element: "+arr[9]);
		
		
	}
}