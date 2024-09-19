package lecture010;

import java.util.Scanner;


//alt + shit + m new funciton
public class MainCart {

	public static void main(String[] args) {
		//empty
		Object[][] cart = new Object[0][1];
		//[0][0]
		//[0][1]
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean continu = false;
		
		do {
			int optionMmenu = Menu.getOPtion(keyboard);
			
			switch (optionMmenu) {
				case 1: {
					Object[][] data = readData(keyboard);
					
					//cart = Cart.add(cart, (int)data[0][0], (String)data[0][1]);
					cart = Cart.add2(cart, data);	
					break;
				}
				case 2: {
					System.out.println("Delete");
					int id = keyboard.nextInt();
					
					//alt + shift + r
					if(Cart.exist(cart, id)) {
						cart = Cart.delete(cart, id);
					} else {
						System.out.println(id + "Doesn't exist");
					}
					break;
				}
				case 3: {
					
					System.out.println("Enter the id");
					int id = keyboard.nextInt();
					
					if(Cart.exist(cart, id)) {
						System.out.println("Enter the quantity");
						int nq = keyboard.nextInt();
						Cart.update(id, cart, nq);
						
					}
					break;
				}
				case 4: {
					
					Cart.show(cart);
					break;
				}
				
				case 5: {
					cart = Cart.clearCart(cart);					
					break;
				}
				
				default:{
					System.out.println("Bye");
					break;
				}
			}
			
			
			continu = Menu.continu(keyboard);
		} while (continu);

		
		
		
		Cart.show(cart);
		
		keyboard.close();
	}
	

	
	static Object[][] readData(Scanner keyboard) {
		System.out.println("Enter artcicle's id");
		int id = keyboard.nextInt();
		
		System.out.println("Enter artcicle's name");
		String name = keyboard.next();
		//[0,0],[0,1]
		
		Object[][] data = new Object[1][2];
		
		data[0][0] = id;
		data[0][1] = name;
		
		return data;
	}
}
