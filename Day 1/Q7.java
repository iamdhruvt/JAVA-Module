import java.util.Scanner;

class Q7{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		System.out.println("Enter subject marks: ");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		int total=s1+s2+s3+s5+s4;
		double percentage=(double)total/5;
		System.out.println("Total Sum of marks is: "+total);
		System.out.println("Percentage is: "+percentage+"%");
		
	}
}