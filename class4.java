package hw4;

public class class4 {

	public static void main(String[] args) {
		racingcar4 rccar1;
		rccar1=new racingcar4();
		rccar1.setcar4(1234,20.5);
		rccar1.setcourse(5);
		
		rccar1.show();
	}
}
class car4
{
	protected int num;
	protected double gas;
	
	public car4()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setcar4(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class racingcar4 extends car4
{
	private int course;
	public racingcar4()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	
	public void setcourse(int c)
	{
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號設是"+course);
	}
}
