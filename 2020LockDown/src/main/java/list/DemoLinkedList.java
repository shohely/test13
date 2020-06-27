package list;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
	public static void main(String[] args) {
		//is part of list interface
	LinkedList<String> names =new LinkedList <String>();
	 
	names.add("shohely");
	names.add("eva");
	names.add("rajib");
	names.add("mahbub");
	
	System.out.println(names.get(1));
	
	System.out.println(names);
	List<Integer> score=new LinkedList<Integer>();
	
	score.add(100);
	score.add(98);
	score.add(99);
	
	System.out.println(score);
	
		
		
		
	}

}
