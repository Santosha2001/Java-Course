class Brick{
	static String soilUsed;
	static boolean brickBrunt;
	String shape;
	String brickUsedFor;
	
	public void brickInstanceVarMethod(){
		System.out.printf("shape: %s \nbrickUsedFor: %s",shape,brickUsedFor);
	}
	
	static void brickStaticVarMethod(){
		System.out.printf("\nsoilUsed: %s \nbrickBrunt: %b",soilUsed,brickBrunt);
	}
	
	Brick(String shape, String brickUsedFor){
		this.shape = shape;
		this.brickUsedFor = brickUsedFor;
	}
	
	static{
		soilUsed = "Red & Black";
		brickBrunt = true;
	}
}