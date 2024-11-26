package hw4;

public class class2 {

	public static void main(String[] args) {
		racingcar2 rccar1=new racingcar2(1234,20.5,5);
		
	}
}
class car2
{
	private int num;
	private double gas;
	public car2()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public car2(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號設為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void setcar2(int n,double g)
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
class racingcar2 extends car2
{
	private int course;
	public racingcar2()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	public racingcar2(int n,double g,int c)
	{
		super(n,g);
		course=c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setcourse(int c)
	{
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
}
