public class ElectronicsStore
{
	public static void main(String args[])
	{
		double laptop = 4904.90;
		double mouse = 300.09;
		double keyboard = 192.92;
		double monitor = 843.48;
		double tax = 0.13;
		double subtotal = laptop + mouse + keyboard + monitor;
		double taxes = (laptop + mouse + keyboard + monitor) * tax;
		double total = laptop + mouse + keyboard + monitor + taxes;
		System.out.println("========== RECEIPT ==========");
		System.out.println();
		System.out.println("Laptop: " + laptop);
		System.out.println("Mouse: " + mouse);
		System.out.println("Keyboard: " + keyboard);
		System.out.println("Monitor: " + monitor);
		System.out.println();
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Tax (13%): " + taxes);
		System.out.println("Grand Total: " + total);
		System.out.println();
		System.out.println("=============================");



	}
}