package hw4;

public class class11 {

	public static void main(String[] args) {
		
		vehicle11[] vc=new vehicle11[2];
		
		vc[0]=new car11(1234,20.5);
		vc[1]=new plane11(232);
		
		
		
		for (int i=0; i<vc.length;i++) {
			if (vc[i]instanceof car11) {
				System.out.println("��"+(i+1)+"�Ӫ���OCar���O");
			}
			else {
				System.out.println("��"+(i+1)+"�Ӫ��󤣬OCar���O");
			}
			
				
		}
	}

}

abstract class vehicle11{
	protected int speed;
	
	public void setspeed(int s) {
		speed=s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	abstract void show();
}
class car11 extends vehicle11{
	private int num;
	private double gas;
	public car11(int n, double g) {
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
class plane11 extends vehicle11{
	private int flight;
	
	public plane11(int f) {
		flight =f;
		
		System.out.println("�Ͳ��F"+flight+"�Z��������");

	}
	
	public  void show() {
		System.out.println("�����Z��"+flight);
		System.out.println("�t��"+speed);
	}
}