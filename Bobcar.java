
	import java.util.Scanner;

	public class Bobcar {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int n1, n2, price = 0 , discount = 0 ;
			String type ="";
			
			System.out.println("Available Cars");
			System.out.println("Choose 1 for Economy, 2 for Compact, 3 for Standard");
			
			System.out.print("Please choose your car type: ");
			n1 = input.nextInt();
			if (n1 == 1) {
				price = 25;
				type = "Economy";
			} else if (n1 == 2) {
				price = 55;
				type = "Compact";
			} else if (n1 == 3) {
				price = 100;
				type = "Standard";
			} else { 
				
				System.out.println("Wrong operation type");
				System.exit(0);
			}
			
			
			System.out.print("Please enter the number of rental days: ");
			n2 = input.nextInt();
			
			System.out.println("Are you a club member?: ");
			System.out.print("Press 1 for yes or 0 for No: ");
			int dataType = input.nextInt();
			
			
			int total = (price*n2);
			
			
			if (dataType == 1) {
				
				int rem = (int) (n2/5);
				discount = rem * price;
				
				System.out.println("Would you like the Platinum Executive Package?: ");
				System.out.print("Press 1 for Yes or 0 for No : ");
				int dataType1 = input.nextInt();
				
				
				if (dataType1 == 1)  {
					float plat = (float) 0.2 * total;
					int peprice = (int) plat;
					
					System.out.println("Base Price: " + n2 + " days for a " + type + " at $" + price + " per day:      $" + total );
					System.out.println("Club Member Discount:                                -$" + discount);
					System.out.println("Platinum Executive Package:                          +$" + peprice );
					System.out.println("Total Estimate for Rental:                            $" + (total - discount + peprice));
				} else if (dataType1 == 0) {
					System.out.println("Base Price: " + n2 + " days for a " + type + " at $" + price + " per day:      $" + total );
					System.out.println("Club Member Discount:                                -$" + discount);
					System.out.println("Total Estimate for Rental:                            $" + (total - discount));
				} else {
					System.out.println("Wrong input");
				}
			} else if (dataType == 0) {
				
				System.out.println("Base Price: " + n2 + " days for a " + type + " at $" + price + "per day:           $" + total);
				System.out.println("Total Estimate for Rental:                                $" + (total));
			} else {
				
				System.out.println("Wrong Input");
				
				
				
				
				
			
			}
			

}}