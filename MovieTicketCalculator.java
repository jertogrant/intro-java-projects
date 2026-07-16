public class MovieTicketCalculator
{
	public static void main(String[] args)
	{
		int numOfAdultTix = 7;
		double adultTixPrice = 52.99;
		int numOfChildTix = 4;
		double childTixPrice = 25.98;
		double tax = 0.09;
		double totalAdult = numOfAdultTix * adultTixPrice;
		double totalChild = numOfChildTix * childTixPrice;
		double subtotal = totalAdult + totalChild;
		double taxes = subtotal * tax;
		double finalCost = subtotal + taxes;
		double avgCost = finalCost / (numOfAdultTix + numOfChildTix);
		System.out.println("========== MOVIE RECEIPT ==========");
		System.out.println();
		System.out.println("Adult Tickets: " + numOfAdultTix);
		System.out.println("Child Tickets: " + numOfChildTix);
		System.out.println();
		System.out.println("Adult Subtotal: " + totalAdult);
		System.out.println("Child Subtotal: " + totalChild);
		System.out.println();
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Tax: " + taxes);
		System.out.println("Final Total: " + finalCost);
		System.out.println();
		System.out.println("Average Cost Per Ticket: " + avgCost);
		System.out.println();
		System.out.println("===================================");
	}
}