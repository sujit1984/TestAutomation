package collectionsExample;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(90);
		
		int i = list.get(1);
		System.out.println(i);
	}

}
