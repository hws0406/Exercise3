
public class Main {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println("Brand: " + c.brand);
		System.out.println("Model: " + c.model);
		System.out.println("Colour: " + c.colour);
		System.out.println("Price: RM" + c.price);
		System.out.println("Installment: " + c.installment + "years");
		System.out.println("Monthly Price: " + c.yearPrice);
	
		Car d = new Car("Mercedes", "C Class Coupe", "White", 347000, 10);
		
		System.out.println("Brand: " + d.brand);
		System.out.println("Model: " + d.model);
		System.out.println("Colour: " + d.colour);
		System.out.println("Price: RM" + d.price);
		System.out.println("Installment : " + d.installment + "years");
		System.out.println("Monthly Price: RM " + d.yearPrice);
	}
}
