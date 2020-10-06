import java.util.Scanner;

class Employee{
	private static int empNo=0;
	private int salary;
	private static int totalSalary=0;

	


	Employee(int salary){
		this.empNo++;
		this.salary=salary;
		this.totalSalary=totalSalary+salary;
	}

	void display(){
		System.out.println("empNo : "+empNo+" "+"Salary : "+salary+"  "+"TotalSalary : "+totalSalary);
		
	}
}


public class Q38 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee(20);
		e.display();
		Employee e1 = new Employee(20);
		e.display();
		
	}
}
