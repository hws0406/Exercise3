import java.util.Scanner;
public class Car {
	
		Scanner s = new Scanner(System.in);
		String brand, model, colour;
		double price, installment, yearPrice;
		
		Car() {
			System.out.println("Enter Brand: ");
			this.brand = s.nextLine();
			System.out.println("Enter Model: ");
			this.model = s.nextLine();
			System.out.println("Enter Colour: ");
			this.colour = s.nextLine();
			System.out.println("Enter Price: ");
			this.price = s.nextDouble();
			System.out.println("Enter Installment Plan: ");
			this.installment = s.nextDouble();
			this.yearPrice = (this.price/this.installment);
		
		}
		
		Car(String brand,String model,String colour,double price, double installment) {
			this.brand = brand;
			this.model = model;
			this.colour = colour;
			this.price = price;
			this.installment = installment;
			this.yearPrice = (this.price/this.installment);
		}
}
