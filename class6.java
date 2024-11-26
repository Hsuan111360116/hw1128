package hw4;

public class class6 {

	public static void main(String[] args) {
		car6 cars[];
		cars=new car6[2];
		cars[0]=new car6();
		cars[0].setcar6(1234,20.5);
		cars[1]=new racingcar6();
		cars[1].setcar6(4567,30.5);
for(int i=0;i<cars.length;i++)
	{
	cars[i].show();
	}
}
}
class car6
{
	protected int num;
	protected double gas;
	public car6()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setcar6(int n,double g)
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
class racingcar6 extends car6
{
	private int course;
	public racingcar6()
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
