
public class Main {

	public static void main(String[] args) {
		
		Adidas y = new Adidas();
		System.out.println("-----------------------Adidas----------------");
		System.out.println("Size:" + y.getSize());
		System.out.println("Brand" + y.getBrand());
		System.out.println("Price: RM" + y.getPrice());
		System.out.println("Quantity:" + y.getQuantity());
		System.out.println("Total Price:RM" + y.getTotal());
		System.out.println("Discount:RM " + y.Discount());
		System.out.println("Final Total: RM" + y.FinalTotal());
		
		System.out.println();
		
		Eureka E = new Eureka();
		System.out.println("-----------------------Eureka----------------");
		System.out.println("Size:" + E.getSize());
		System.out.println("Brand" + y.getBrand());
		System.out.println("Price: RM" + E.getPrice());
		System.out.println("Quantity:" + E.getQuantity());
		System.out.println("Total Price:RM" + E.getTotal());
		System.out.println("Discount:RM " + E.Discount());
		System.out.println("Final Total: RM" + E.FinalTotal());
		
	}

}