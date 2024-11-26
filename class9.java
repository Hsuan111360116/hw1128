package hw4;

public class class9 {

	public static void main(String[] args) {
		
		car9[] cars=new car9[2];
		
		cars[0]=new car9();
		cars[1]=new racingcar();
		
		for (int i=0; i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件類別是"+cl);
		}
	}

}

class car9{
	protected int num;
	protected double gas;
	
	public car9() {
		
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
}
class racingcar extends car9{
	public racingcar() {
		System.out.println("生產了賽車");
	}
}