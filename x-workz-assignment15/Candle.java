public class Candle{
	static String fuelUsedInCandle;
	static String wickPosition;
	char candleSize;
	double price;
	
	public void candleInstanceVarMethod(){
		System.out.println("candleSize: " + candleSize);
		System.out.println("price: " + price);
	}
	
	static void candleStaticVarMethod(){
		System.out.println("fuelUsedInCandle: " + fuelUsedInCandle);
		System.out.println("wickPosition: " + wickPosition);
	}
	
	Candle(char candleSize, double price){
		this.candleSize = candleSize;
		this.price = price;
	}
	
	static{
		fuelUsedInCandle = "Candle Wax";
		wickPosition = "Center";
	}
}