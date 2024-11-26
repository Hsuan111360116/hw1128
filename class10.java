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
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class car10 extends vehicle10{
	private int num;
	private double gas;
	public car10(int n, double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");

	}
	
	public  void show() {
		System.out.println("車號"+num);
		System.out.println("汽油量"+gas);
		System.out.println("速度"+speed);
	}
}
class plane10 extends vehicle10{
	private int flight;
	
	public plane10(int f) {
		flight =f;
		
		System.out.println("生產了"+flight+"班次的飛機");

	}
	
	public  void show() {
		System.out.println("飛機班次"+flight);
		System.out.println("速度"+speed);
	}
}