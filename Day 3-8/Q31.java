
class Student
{
	private int rno;
	private String name;
	void setData(int r,String sname){
		rno=r;
		name=sname;
	}
	void showData(){
		System.out.println("Roll no: "+rno);
		System.out.println("Name : "+name);
	}
}

class StudentDemo{
	
	public static void main (String args[])
	{
		
		Student s=new Student();
		s.setData(35,"Dhruv");
		s.showData();
	}
}