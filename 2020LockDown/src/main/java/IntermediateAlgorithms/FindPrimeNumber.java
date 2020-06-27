package IntermediateAlgorithms;

public class FindPrimeNumber {
	
	//prime numbers--3, 5, 7, 11, 13, 17
	//its divisible by 1 and itself 
	
	// if 15 is prime number--
	
	int x = 17;
	boolean isPrime = true;
		
	for(int i=2; i<x; i++){
		if (x%i==0){
			isPrime=false;
			break;
		
		}// end if 
	} // end for 
	if(isPrime==true)
		System.out.println(x+"is a Prime Number ");
	else 
		System.out.println(x+"is Not a Prime Number");
	
	}
}
		
