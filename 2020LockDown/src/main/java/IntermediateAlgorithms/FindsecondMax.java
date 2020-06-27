package IntermediateAlgorithms;

public class FindsecondMax {

	public static void main(String[] args) {
		// num= 2, 209, 5, 567, 45, 5006, 10
		int[] num= {2000, 209, 5, 567, 45, 5006, 10};
		
		int maxOne=0;
		int maxTwo=0;
		
		for(int i=0; i<num.length;i++) {
			
			if(num[i]>maxOne) {
				maxTwo=maxOne;
				maxOne=num[i];
			}//end if 
			else if (num[i]>maxTwo) {
				maxTwo=num[i];
			
	}//end else if 
		}//end for 
		
		System.out.println("Max One: "+maxOne);
		System.out.println("Max Two: "+maxTwo);

	}

}
