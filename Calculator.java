package lecture010;

public class Calculator {
	//type
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 * This performs the sum of 2 values.
	 */
	public static double add(double x, double y) {
		return x+y;
	}
	
	//procedures -> void
	/**
	 * This displays a message on the screen.
	 */
	public static void turnOn() {
		System.out.println("Start.....");
	}
	
	public static void turnOnWithParameters(String message) {
		System.out.println("Start....." + message);
	}
}
