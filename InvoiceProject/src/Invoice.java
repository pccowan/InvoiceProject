import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int count = 1;
		double price, taxRate, subTotal = 0.0, taxTotal, grandTotal;

		String output = "";

		System.out.print("Tax Rate ? : ");
		taxRate = keyboard.nextDouble();
		keyboard.nextLine();

		do {
			System.out.print("Price # : " + count + " ");
			price = keyboard.nextDouble();

			if (price != 0) {
				count++;
				output += price + "\n";
				subTotal += price;

			}

		} while (price != 0);

		System.out.println("-------------------------------------------");

		System.out.println("Receipt");

		System.out.println(output);

		taxTotal = (subTotal * taxRate);
		grandTotal = (subTotal + taxTotal);

		System.out.println(subTotal + " subtotal");

		System.out.println(taxTotal + " tax");

		System.out.println(grandTotal + " grand total");

	}

}
