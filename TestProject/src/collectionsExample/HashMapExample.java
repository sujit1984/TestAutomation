package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("1", "Kevin");
		map.put("2", "Roger Federer");
		map.put("3", "Rafael Nadal");
		map.put("4", "Novak Djokovic");
		
		
		System.out.println(map);
		
		System.out.println(map.get("1"));
		
		for (String var: map.keySet()) {
			System.out.println("Key -->"+var+ " Value --> " +map.get(var));
		}
		
		Map<String, List<String>> map1 = new HashMap<String,List<String>>();
		
		List<String> listOfEmails = new ArrayList<String>();
		listOfEmails.add("test1@invalidemail.com");
		listOfEmails.add("test2@invalidemail.com");
		listOfEmails.add("test3@invalidemail.com");
		
		map1.put("email", listOfEmails);
		
		System.out.println(map1);
		
		
	}

}
