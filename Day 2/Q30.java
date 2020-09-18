import java.util.Scanner;

class Q30
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int i,j;
		int sum=0;
		System.out.println("Enter elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			arr[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			if(i==j)
			{
				sum=sum+arr[i][j];
			}
			}
		}
		System.out.println("Sum of diagonal: "+sum);
	}
}