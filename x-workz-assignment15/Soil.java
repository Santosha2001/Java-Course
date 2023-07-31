class Soil{
	static String soilTextureMadeOff;
	static String soilChemistry;
	String soilColor;
	String mineralParticals;
	
	public void soilInstanceVarMethod(){
		System.out.println("soilColor: " + soilColor);
		System.out.println("mineralParticals: " + mineralParticals);
	}
	
	static void soilStaticVarMethod(){
		System.out.println("soilTextureMadeOff: " + soilTextureMadeOff);
		System.out.println("soilChemistry: " + soilChemistry);
	}
	
	Soil(String soilColor, String mineralParticals){
		this.soilColor = soilColor;
		this.mineralParticals = mineralParticals;
	}
	
	static{
		soilTextureMadeOff = "Sand,Stone";
		soilChemistry = "Clay";
	}
}