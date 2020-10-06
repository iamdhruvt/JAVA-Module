
class Circle
{
	private int r;
	private double area;
	
	void init(int r){
		this.r=r;
		}
	void calculateArea(){
		area=3.14*r*r;
	}
	void display()
	{
		System.out.println("Radius :"+r);
		System.out.println("Area :"+area);
	}

}

class CircleDemo{
	
	public static void main (String args[])
	{
		
		Circle c=new Circle();
		c.init(10);
		c.calculateArea();
		c.display();

	}
}