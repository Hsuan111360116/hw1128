package hw4;

public class class3 {

	public static void main(String[] args) {
		racingcar3 rccar1;
		rccar1=new racingcar3();
		rccar1.newshow();
	}
}
class car3
{
	protected int num;
	protected double gas;
	
	public car3()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar3(int n,double g)
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
class racingcar3 extends car3
{
	private int course;
	public racingcar3()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setcourse(int c)
	{
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void newshow()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���]�O"+course);
	}
}
