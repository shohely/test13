package simpleAlgorithms;

public class FizzBussRange {

static void fizzbuss(int range, int num1, int num2) {

	for(int i=1; i<=range; i++) {
		if(i%num1==0 && i%num2==0)
			System.out.println("FizzBuss");
		else if(i%num1==0)
			System.out.println("Fizz");
		else if(i%num2==0)
			System.out.println("Buzz");
		else 
	 System.out.println(i);
	}

	}//end fizzbuss
	public static void main(String[] args) {
		//Fizzbussrange fbr = new Fizzbusrange()
		fizzbuss(50,3,7);
	}
}
