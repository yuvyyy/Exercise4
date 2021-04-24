
public class Eureka extends Jersey{
	
	private Double NoOfShirt;
	

    //method
	public double Discount() {
		System.out.println("Enter No of shirt:");
		NoOfShirt = scan.nextDouble();
		double X = (NoOfShirt * 3);
		return X;
	}
	
	double FinalTotal() {
		
		double FT =  super.getTotal()-Discount();
		return FT;
	}
	
	
	
	

}