package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet();
		
		set.add(100);
		set.add("This");
		set.add(200);
		set.add(300);
		set.add(100);
		
		System.out.println(set);  // in set duplicate values are not stored. 
		
		Set<String> hset = new HashSet<String>();
		hset.add("First");
		hset.add("Second");
		hset.add("Third");
		hset.add("Fourth");
		hset.add("Fifth");
		hset.add("Last");
		System.out.println(hset);
		
		for (String item:hset) {
			System.out.println(item);
		}
		
		
		Iterator itr = hset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}
