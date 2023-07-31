public class MainFile{
	public static void main(String[] args){
		
		Helmate helmate = new Helmate(1000,'m');
		helmate.helmateInstanceVariables();
		Helmate.staticVariableMethod();
		System.out.println("\n");
		
		Candle candle = new Candle('M', 10);
		candle.candleInstanceVarMethod();
		Candle.candleStaticVarMethod();
		System.out.println("\n");
		
		Brick brick = new Brick("Rectangle", "Construction");
		brick.brickInstanceVarMethod();
		Brick.brickStaticVarMethod();
		System.out.println("\n");
		
		Soil soil = new Soil("Black", "Water,Air,Stones");
		soil.soilInstanceVarMethod();
		Soil.soilStaticVarMethod();
		System.out.println("\n");
		
		ButterFly butterfly = new ButterFly(2, "Inside  Body");
		butterfly.instanceVarMethod();
		ButterFly.staticVarMethod();
		System.out.println("\n");
		
		Power power = new Power("Physical", "Activity");
		power.instanceVarMethod();
		Power.staticVarMethod();
		System.out.println("\n");
		
		Bureau bureau = new Bureau(2, 'M');
		bureau.instanceVarMethod();
		Bureau.staticVarMethod();
	}
}