package train1;

public class Mobile {
	
	int price ; 
	String brand;
	String model;
	static String type;
	
	public String show() {
		return brand + type + price + " " +  model;
	}
	
	/* What is static ?
	 * Static variable is shared by all objects , so if we change the attribute declared with static all the objects will be influenced
	 Hence its used for class
	 */
	
	/* Why can't we use non - static main ? 
	 * 
	 * Because main is the starting point of execution , and without main we cannot create objects , without object we cannot create a non static method .
	 * hence its like a deadlock . 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1 = new Mobile();
		m1.price = 15000;
		m1.brand = "IPhone";
		m1.model = "13";
		Mobile.type = " Phone ";
		
		Mobile m2 = new Mobile();
		m2.price = 15000;
		m2.brand = "IPhone";
		m2.model = "13";
		Mobile.type = " SmartPhone ";
		
		/* Non static variable cannot be used under static methods , static methods are the references to the class , class methods
		
		*/
		System.out.println(m1.show());		
		
	}

}
