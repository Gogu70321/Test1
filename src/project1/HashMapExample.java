package project1;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> Gogu = new HashMap<Integer, String>();
		HashMap<Integer, String> Gogu1 = new HashMap<Integer, String>();

		Gogu.put(1, "India");
		Gogu.put(2, "America");
		Gogu.putIfAbsent(3, "Gogu");
		// Copying one map values into another.
		Gogu1.putAll(Gogu);
		// Key set is used to get key values without duplicates.
		System.out.println(Gogu.keySet());

		Gogu.replace(1, "Indiaa");

		System.out.println(Gogu);

	}

}
