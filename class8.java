package hw4;

public class class8 {

	public static void main(String[] args) {
		
		car8 car1 ;
		car1 = new car8();
		
		car8 car2 ;
		car2 = new car8();
		
		car8 car3=car1;
		
		System.out.println("car1�Pcar2�ۦP"+car1.equals(car2));
		System.out.println("car1�Pcar3�ۦP"+car1.equals(car3));
		

	}

}

class car8{
	protected int num;
	protected double gas;
	
	public car8() {
		
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
}