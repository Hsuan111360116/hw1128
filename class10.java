package hw4;

public class class10 {

	public static void main(String[] args) {
		
		vehicle10[] vc=new vehicle10[2];
		
		vc[0]=new car10(1234,20.5);
		vc[0].setspeed(60);
		
		vc[1]=new plane10(232);
		vc[1].setspeed(500);
		
		
		for (int i=0; i<vc.length;i++) {
			vc[i].show();
		}
	}

}

abstract class vehicle10{
	protected int speed;
	
	public void setspeed(int s) {
		speed=s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	abstract void show();
}
class car10 extends vehicle10{
	private int num;
	private double gas;
	public car10(int n, double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");

	}
	
	public  void show() {
		System.out.println("����"+num);
		System.out.println("�T�o�q"+gas);
		System.out.println("�t��"+speed);
	}
}
class plane10 extends vehicle10{
	private int flight;
	
	public plane10(int f) {
		flight =f;
		
		System.out.println("�Ͳ��F"+flight+"�Z��������");

	}
	
	public  void show() {
		System.out.println("�����Z��"+flight);
		System.out.println("�t��"+speed);
	}
}