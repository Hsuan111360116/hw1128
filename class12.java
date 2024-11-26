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
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");

	}
	
	public  void show() {
		System.out.println("車號"+num);
		System.out.println("汽油量"+gas);
	}
}
class plane12 implements ivehicle12{
	private int flight;
	
	public plane12(int f) {
		flight =f;
		
		System.out.println("生產了"+flight+"班次的飛機");

	}
	
	public  void show() {
		System.out.println("飛機班次"+flight);
	}
}