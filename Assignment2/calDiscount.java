import java.util.*;

public class calDiscount {

	public static void main(String[] args) {
		//Accepting item price
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item price");
		double n = scanner.nextDouble();
		
		//Calculating Discount
		System.out.println("Calculating discount");
		double discount = (double)0.35 * n;
		System.out.println("Discount is "+discount);
		
		//Calculating new price
		double newItemPrice = n - discount;
		System.out.println("New Item Price is " + newItemPrice);
	}

}