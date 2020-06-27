package simpleAlgorithms;

public class OddEven {

	public static void main(String[] args) {
	//odd number- 3 ,5 ,7 -Not divisible by 2
		//even number- 2,4,10,100- Divisible by 2
		
		int num= 321;
		
		if(num%2==0)
			System.out.println("Even Number");
		else if(num%2!=0)
			System.out.println("Odd Number");
		else 
			System.out.println("Unknown");

	}

	

}
