package hw4;

public class class7 {

	public static void main(String[] args) {
		
		car7 car1 ;
		car1 = new car7();
		
		car1.setcar(1234,20.5);
		System.out.println(car1);
		
		

	}

}

class car7{
	protected int num;
	protected double gas;
	
	public car7() {
		
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setcar(int n,double g) {
		
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
		
	}
	
public String toString() {
	String str = "車號"+num+"汽油量"+gas;
	return str;
}
}