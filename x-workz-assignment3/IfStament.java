public class IfStament{

    public static void main(String[] args) {
        
		
		System.out.println("If Condition");
        int age = 18;
		if(age == 18){
			System.out.println("You are eligible to get Driving liscence");
		}
		
		
		
		
		int age = 18;
		if(age < 18){
			System.out.println("You are not eligible to get Driving liscence");
		}
		else{
			System.out.println("You are to eligible drive, but first you have to get the Driving liscence");
		}
		
		
		
		
	
		int age = 18;
		if(age < 18){
			System.out.println("You are a kid");
		}
		else if(age == 18){
			System.out.println("You are teen");
		}
		else if(age > 18){
			System.out.println("You are adult");
		}
		else if(age > 70){
			System.out.println("You are old");
		}
		else
			System.out.println("You are not a Human");
		
		
		
		
		int num1 = 10, num2 = 20, max_num;
		
		max_num = (num1 > num2) ? num1 : num2;
		System.out.println("maximum number: " + max_num);
    }
}