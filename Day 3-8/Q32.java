
class Student
{
	private int rno;
	private String name;
	private static int count;
	void setData(int r,String sname,int t){
		rno=r;
		name=sname;
		count=t;
	}
	void showData(){
		System.out.println("Roll no: "+rno);
		System.out.println("Name : "+name);
		System.out.println("Objects created: "+count);
	}
}

class StudentDemo{
	
	public static void main (String args[])
	{
		
		Student s1=new Student();
		s1.setData(35,"Dhruv1",1);
		s1.showData();
		Student s2=new Student();
		s2.setData(36,"Dhruv2",2);
		s2.showData();
		s1.showData();
	}
}