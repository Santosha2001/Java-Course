class Power{
	static String powerUnit; 
	static char powerSymbol; 
	String quantityType; 
	String alternateName; 
	
	public void instanceVarMethod(){
		System.out.printf("quantityType: %s \nalternateName: ",quantityType,alternateName);
	}
	
	static void staticVarMethod(){
		System.out.printf("\npowerUnit: %s \npowerSymbol: ",powerUnit,powerSymbol);
	}
	
	Power(String quantityType, String alternateName){
		this.quantityType = quantityType;
		this.alternateName = alternateName;
	}
	
	static{
		powerUnit = "Watt";
		powerSymbol = 'P';
	}
}