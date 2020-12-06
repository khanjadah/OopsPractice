package hashMap;

import java.util.HashMap;

public class HashMain {

	public static void main(String[] args) {
		
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		
		
		people.put("Hurayra", 27);
		people.put("Haque",59);
		people.put("nora",21);
		
		for (String i : people.keySet()) {
		      System.out.println("key: " + i + "/ value: " + people.get(i));
		    }

	}

}
