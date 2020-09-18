import java.util.Scanner;

class Q20
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int n1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2=sc.nextInt();
		
		
		for(int i=n1;i<n2;i++)
		{
			if(n2%i==0)
				continue;
			else
			{
				int check=0;
				for(int y=2;y<i;y++)
				{
					if(i%y==0)
					{
						check=1;
					}
					
				}
				if(check==0)
					System.out.println(i);
				
			}
			
		}
	}
}