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
		System.out.println("�Ͳ��F���l");
	}
	public car2(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�Ͳ��F�����]��"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void setcar2(int n,double g)
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
class racingcar2 extends car2
{
	private int course;
	public racingcar2()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public racingcar2(int n,double g,int c)
	{
		super(n,g);
		course=c;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
	}
	public void setcourse(int c)
	{
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}
