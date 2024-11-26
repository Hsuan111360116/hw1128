package hw4;

public class class11 {

	public static void main(String[] args) {
		
		vehicle11[] vc=new vehicle11[2];
		
		vc[0]=new car11(1234,20.5);
		vc[1]=new plane11(232);
		
		
		
		for (int i=0; i<vc.length;i++) {
			if (vc[i]instanceof car11) {
				System.out.println("第"+(i+1)+"個物件是Car類別");
			}
			else {
				System.out.println("第"+(i+1)+"個物件不是Car類別");
			}
			
				
		}
	}

}

abstract class vehicle11{
	protected int speed;
	
	public void setspeed(int s) {
		speed=s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class car11 extends vehicle11{
	private int num;
	private double gas;
	public car11(int n, double g) {
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
class plane11 extends vehicle11{
	private int flight;
	
	public plane11(int f) {
		flight =f;
		
		System.out.println("生產了"+flight+"班次的飛機");

	}
	
	public  void show() {
		System.out.println("飛機班次"+flight);
		System.out.println("速度"+speed);
	}
}