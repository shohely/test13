package IntermediateAlgorithms;

import java.util.ArrayList;

public class PrimeNumberRange {

	int range =50;
	boolean isPrime=true;
	ArrayList<Integer> primes = new ArrayList<Integer>();
	
	for (int i=3; i<=range; i++) {
		
		for(int j=2; j<i/2; j++) {
			if(i%j==0) {
				isPrime=false;
				break;
				
			}//end if 
		}//end for j
		
		if (isPrime==true)
			primes.add(i);
		isPrime=true;
	}//end for i
	
	System.out.println(primes);
	System.out.println(primes.size());

}
}