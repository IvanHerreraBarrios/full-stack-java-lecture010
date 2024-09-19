package lecture010;


public class Cart {
	public static Object[][] add(Object[][] cart, int newId, String name){
		Object[][] newCart = add3(cart);
		
		newCart[cart.length][0] = newId;
		newCart[cart.length][1] = name;
		
		return newCart;
	}

	private static Object[][] add3(Object[][] cart) {
		Object[][] newCart = new Object[cart.length + 1][2];
		
		for(int i=0; i< cart.length; i++) {
			//id
			newCart[i][0] = cart[i][0];
			//name
			newCart[i][1] = cart[i][1];
		}
		return newCart;
	}
	
	public static Object[][] add2(Object[][] cart, Object[][] data){
		Object[][] newCart = add3(cart);
		
		newCart[cart.length][0] = data[0][0];
		newCart[cart.length][1] = data[0][1];
		
		return newCart;
	}
	
	
	//f3 find
	//alt -> or alt <- 
	
	public static void show(Object[][] cart) {
		for(Object[] c:cart) {
			System.out.println("id" + c[0] + "name" + c[1]);
		}
	}

	/**
	 * pre-conditions
	 * 1-The id exist in the cart
	 * 2-The cart is not empty
	 * n-descri
	 * @param cart
	 * @return
	 */
	public static Object[][] delete(Object[][] cart, int id) {
		// TODO Auto-generated method stub
		Object[][] newCart = new Object[cart.length-1][2];
		int j=0;
		for(int i=0;i<cart.length;i++) {
			if((int)cart[i][0] != id) {
				newCart[j][0] = cart[i][0];
				newCart[j][1] = cart[i][1];
				j++;
			}
		}
		return newCart;
	}
	/**
	 * It determines if the id exist in the array.
	 * @param cart
	 * @param id
	 * @return
	 */
	public static boolean exist(Object[][] cart, int id) {
		int idx = -1;
		for(int i=0;i<cart.length && idx == -1;i++) {
			if((int)cart[i][0] == id) {
				idx = i;
			}
		}
		return idx != -1;
	}
	
	static double getTotal(Object[][] cart) {
		double total = 0;
		for(Object[] article : cart) {
			total += (Integer)article[0];
		}
		return total;
	}
	
	public static int search(Object[][] cart, int id) {
		int idx = -1;
		for(int i=0;i<cart.length && idx == -1;i++) {
			if((int)cart[i][0] == id) {
				idx = i;
			}
		}
		return idx;
	}
	
	static void update(int id, Object[][] cart, int newQuantity) {
		int idx = search(cart, id);
		
		if(idx != -1) {
			cart[idx][1] = cart[idx][1] + "-" + newQuantity;
			
		}
	}
	
	static Object[][] clearCart(Object[][] cart) {
		cart = new Object[0][2];
		return cart;
	}

}
