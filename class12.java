package hw4;

public class class12 {

	public static void main(String[] args) {
		
		ivehicle12[] ivc=new ivehicle12[2];
		
		ivc[0]=new car12(1234,20.5);
		ivc[1]=new plane12(232);
		
		
		
		for (int i=0; i<ivc.length;i++) {
			
			ivc[i].show();
				
		}
	}

}

interface ivehicle12{
	int weight;
	void show();
}
class car12 implements ivehicle12{
	private int num;
	private double gas;
	public car12(int n, double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");

	}
	
	public  void show() {
		System.out.println("����"+num);
		System.out.println("�T�o�q"+gas);
	}
}
class plane12 implements ivehicle12{
	private int flight;
	
	public plane12(int f) {
		flight =f;
		
		System.out.println("�Ͳ��F"+flight+"�Z��������");

	}
	
	public  void show() {
		System.out.println("�����Z��"+flight);
	}
}