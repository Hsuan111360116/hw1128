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
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar6(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class racingcar6 extends car6
{
	private int course;
	public racingcar6()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setcourse(int c)
	{
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���]�O"+course);
	}
}
