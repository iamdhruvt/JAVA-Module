import java.util.Scanner;

class Q26
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][4];
		int i,j,counter=0;
		System.out.println("Enter elements: ");
		for(i=0;i<5;i++)
		{
			
				for(j=0;j<4;j++)
				{
					if (counter<17)
					{
					arr[i][j]=sc.nextInt();
					counter++;
					}
					else
						break;
				}
			
		}
		int sum=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum: "+sum);
	}
}