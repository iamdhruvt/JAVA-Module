import java.util.Scanner;

class Q28
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		int i,j;
		System.out.println("Enter elements: ");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("Printing string array: ");
		for(String c:arr)
		{
			System.out.println(c);
		}
	}
}