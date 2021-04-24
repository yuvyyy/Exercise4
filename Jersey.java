import java.util.Scanner;

public class Jersey {

	private String Size,Brand;
	private double Price;
	private int Quantity;
	private double TotalPrice;
		
		//default constructor
		Scanner scan = new Scanner(System.in);

		Jersey(){
			
			System.out.print("Your Jersey size: ");
			this.Size = scan.nextLine();
			
			System.out.print("Your Jersey Brand: ");
			this.Brand = scan.nextLine();
			
			System.out.print("Enter Jersey price:RM");
			this.Price = scan.nextDouble();
			
			System.out.print("Enter Quantity: ");
			this.Quantity = scan.nextInt();
			
			this.TotalPrice = this.Price*this.Quantity;
			System.out.print("Total price is: RM" + this.TotalPrice);
			System.out.println();
		} 
		

		public String getSize() {
			return this.Size;
		}
		
		public String getBrand() {
			return this.Brand;
		}
		
		public Double getPrice() {
			return this.Price;
		}
		
		public Integer getQuantity() {
			return this.Quantity;
		}
		public Double getTotal() {
			return this.TotalPrice;
		}
}
