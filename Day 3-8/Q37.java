import java.util.Scanner;

	class Person
	{
		int age;
		String name;
		
		Person()
		{
			age=18;
		}

		
		Person(int age, String name)
		{
			this.age=age;
			this.name=name;
		}
		
		void display()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
	}

	class Q37
	{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter Name: ");
			String name=scan.next();
			System.out.print("Enter age: ");
			int age=scan.nextInt();
			
			Person P=new Person(age,name);
			P.display();
		}
	}