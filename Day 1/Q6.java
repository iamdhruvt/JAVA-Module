import java.util.Scanner;

class Q6{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r=sc.nextInt();
		double area,circ;
		area=3.14*r*r;
		circ=2*2.14*r;
		System.out.println("Area is: "+ area);
		System.out.println("Circumference is: "+circ);
	}
}