package hw4;

public class class5 {

	public static void main(String[] args) {
		car5 car1;
		car1=new racingcar5();
		car1.setcar5(1234,20.5);
		car1.show();
	}
}
class car5
{
	protected int num;
	protected double gas;
	public car5()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar5(int n,double g)
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
class racingcar5 extends car5
{
	private int course;
	public racingcar5()
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
