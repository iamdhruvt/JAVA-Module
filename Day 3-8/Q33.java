
class Student
{
	private int rno;
	private String name;
	
	void setData(int rno,String name){
		this.rno=rno;
		this.name=name;
		System.out.println("this: "+this);
	}

}

class StudentDemo{
	
	public static void main (String args[])
	{
		
		Student s1=new Student();
		System.out.println("s1: "+s1);
		s1.setData(35,"Dhruv1");
		
		Student s2=new Student();
		System.out.println("s2: "+s2);
		s2.setData(36,"Dhruv2");

	}
}