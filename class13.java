package hw4;

public class class13 {

	public static void main(String[] args) {
		
		car13 car = new car13(1234,20.5);
		car.vshow();
		car.mshow();
	}

}

interface ivehicle13{
	void vshow();
}
interface imaterial13{
	void mshow();
}
class car13 implements ivehicle13,imaterial13{
	private int num;
	private double gas;
	public car13(int n, double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");

	}
	
	public  void vshow() {
		System.out.println("����"+num);
		System.out.println("�T�o�q"+gas);
	}
	public  void mshow() {
		System.out.println("���l������O�K");
	}
}
