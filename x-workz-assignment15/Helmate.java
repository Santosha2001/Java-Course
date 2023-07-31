public class Helmate{
	double price;
	char  helmateSize;
	static String helmateBrand;
	static String manufacturingState;
	
	//method uses instance variables
	public void helmateInstanceVariables(){
		System.out.printf("Price: %f \nhelmateSize: %c", price,helmateSize);
	}
	
	//method uses static variables
	static void staticVariableMethod(){
		System.out.printf("Brand: %s \nmanufacturingState: %s",helmateBrand,manufacturingState);
	}
	
	Helmate(double price,char helmateSize){
		this.price = price;
		this.helmateSize = helmateSize;
	}
	
	//static block
	static{
		helmateBrand = "aa";
		manufacturingState = "Karnataka";
	}
}