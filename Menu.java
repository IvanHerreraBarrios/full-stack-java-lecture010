package lecture010;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		System.out.println("1 Add");
		System.out.println("2 Delete");
		System.out.println("3 Update");
		System.out.println("4 Show");
		System.out.println("5 Clear");
		System.out.println("0 Out");
	}
	
	public static int getOPtion(Scanner keyboard) {
		int option;
		do {
			menu();
			option = keyboard.nextInt();
		}while(option < 0 || option > 5);
		
		return option;
	}
	
	public static boolean continu(Scanner keyboard) {
		System.out.println("Continue y/n");
		return keyboard.next().equalsIgnoreCase("y");
		
	}
}
