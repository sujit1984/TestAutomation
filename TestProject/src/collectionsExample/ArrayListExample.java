package collectionsExample;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		System.out.println(list);
		System.out.println(list.size());
		list.add(10);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		// get the size of the list
		System.out.println(list.size());
		
		//fetching the value from a particular location/index in the list
		System.out.println(list.get(2));
		
		list.add("This");
		list.add("5th");
		System.out.println(list);
		
		//removing values from a location in the list 
		
		list.remove(4);
		System.out.println(list);
		
		//To iterate over the arraylist and print the elements 
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// We can also iterate over it using the foreach loop 
		
		for(Object item:list) {
			System.out.println(item);
		}
		
		// we can also use an iterator to retrieve the list of elements
		
		Iterator itr = list.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
	}	

}
