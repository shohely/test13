package simpleAlgorithms;

public class FindMaximumValue {

	public static void main(String[] args) {
		// num= 2, 209, 5,567, 45, 5006, 10
		int[] num= {2000, 209, 5, 567, 45, 5006, 10};
		//int max= -1;
		int max= Integer.MIN_VALUE;
		for(int i=0; i<num.length;i++) {
			if(num[i]>max)
				max=num[i];
			
		}//end for
		System.out.println("The maqx value: "+max);

	}//end main

}//end class
