package sets;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
	
	//set interface is sorted list and
	//dosnt accept duplicate values
	
	
public static void main(String[] args) {
	HashSet<String> names= new HashSet<String>();
	names.add("shohely");
	names.add("eva");
	names.add("rajib");
	names.add("mahbub");
	System.out.println(names);
	System.out.println("Size of the Set:"+names.size()); 
	names.clear();
	System.out.println(names);
	Set <Integer> score = new HashSet<Integer>();
	
	score.add(100);
	score.add(99);
}
}
