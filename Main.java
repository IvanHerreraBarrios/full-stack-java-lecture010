package lecture010;

public class Main {

	public static void main(String[] args) {
		double value1 = 100.50;
		double value2 = 1500.75;
		
		//f5 enter, f6 out, f8 next
		double add = Calculator.add(value1, value2);
		System.out.println(add);
		
		double substraction = substract(value1, value2);
		System.out.println(substraction);
	}
	
	static double substract(double x, double y){
		return x - y;
	}

}
