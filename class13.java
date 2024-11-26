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
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");

	}
	
	public  void vshow() {
		System.out.println("車號"+num);
		System.out.println("汽油量"+gas);
	}
	public  void mshow() {
		System.out.println("車子的材質是鐵");
	}
}
