package simpleAlgorithms;

public class FizzBuss {

	public static void main(String[] args) {
		
		// number divisible by 3 -fizz (9-fizz)
		// number divisible by 5-(10- buzz)
		// number divisible 3&5 - fizzbuss(15-fizzbus)
		 int[] num= {3,27,124,90,97,129};
		for(int i=0; i<num.length;i++) {
			if(num[i]%3==0 && num[i]%5==0)
				System.out.println("FizzBuss");
			else if(num[i]%3==0)
				System.out.println("Fizz");
			else if(num[i]%5==0)
				System.out.println("Buzz");
			else 
		 System.out.println(num[i]);
		}//end for

	}//end main

}//end class
