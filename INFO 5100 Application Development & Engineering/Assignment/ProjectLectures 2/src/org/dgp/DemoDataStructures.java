package org.dgp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class DemoDataStructures {

	/**
	 * demonstrate use of the java.util.HashMap associative container
	 * an unsynchronized implementation of HashTable which can accept
	 * NULLs.
	 * 		1. Does accept NULL Keys and NULL Values;
	 * 		2. is NOT synchronized (NOT thread safe)
	 * 		3. Does NOT Guarantees ANY Order of elements (initial or consistent)
	 * 		4. Constant Time performance for put and get element (based on hash function)
	 * 
	 */
	public void demoHashMap() {
		System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demoHashMap()...");
		/*
		 *  HashMap<Key, Value>
		 */
		Map<Integer, String>m = new HashMap<>();
		m.put(1,"one");
		m.put(3,"three");
		m.put(5,"five");
		m.put(null, "nullKey");	// hashMap accepts null key
		m.put(7, null);		// HashMap accepts null value

		System.out.println("Display map keys: ");
		for (Integer key : m.keySet()) {
			System.out.print(key + ", ");
		}
		System.out.println("\n TOTAL " + m.size() + " Key elements in map: " + m);

		System.out.println("Display map values: ");
		for (String value : m.values()) {
			System.out.print(value + ", ");
		}
		System.out.println("\n TOTAL " + m.size() + " Value elements in map: " + m);
		
		// random access element by key
		System.out.println("5 is the integer index for the string " + m.get(5));
		
		System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demoHashMap()... done!");		
	}
	
	/**
	 * demonstrate use of the java.util.HashTable associative container
	 * an implementation of an unsynchronized sorted Map
	 * 		1. Does NOT accept NULL values;
	 * 		2. is NOT synchronized (NOT thread safe)
	 * 		3. Map IS SORTED by Key to maintain order of elements
	 * 		4. Constant Time performance for put and get element (based on hash function)
	 * 
	 */
	public void demoHashTable() {
		System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demoHashTable()...");
		Map<String, String> m = new Hashtable<String,String>();		
		m.put("NY","New York");
		m.put("MA","Massachusettes");
		m.put("NH", "New Hampshire");
//		m.put(null, "nullKey");	// NullPointerException: hashtable DOES NOT accept null key
//		m.put("nullKey", null);		// NullPointerException: hashtable DOES NOT accept null value

		System.out.println("Display map keys: ");
		for (String key : m.keySet()) {
			System.out.print(key + ", ");
		}
		System.out.println("\n TOTAL " + m.size() + " Key elements in map: " + m);
		
		System.out.println("Display map values: ");
		for (String value : m.values()) {
			System.out.print(value + ", ");
		}
		System.out.println("\n TOTAL " + m.size() + " Value elements in map: " + m);

		// random access element by key
		System.out.println("NH is the abreviation for the state of " + m.get("NH"));

		System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demoHashTable()... done!");
	}
	
	/**
	 * demonstrate use of the java.util.TreeMap associative container
	 * a Thread Save implementation of HashMap which accepts NULLs
	 * 		1. DOES accept NULL values and NULL KEYS;
	 * 		2. Is Synchronized (thread safe)
	 * 		3. Guarantees Order of elements
	 */
	public void demoTreeMap() {
			System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demoTreeMap()...");
			Map<Integer, String> m = new TreeMap<Integer,String>();		
			m.put(19,"Dan");
			m.put(21,"James");
			m.put(3, "Baby Sue");
//			m.put(null, "nullKey");	// NullPointerException: TreeMap DOES NOT accept null key
//			m.put(7, null);		// NullPointerException: TreeMap DOES NOT accept null value

			System.out.println("Display map keys (Age): ");
			for (Integer key : m.keySet()) {
				System.out.print(key + ", ");
			}
			System.out.println("\n TOTAL " + m.size() + " key elements in map: " + m);

			System.out.println("Display map values (Names): ");
			for (String value : m.values()) {
				System.out.print(value + ", ");
			}
			System.out.println("\n TOTAL " + m.size() + " value elements in map: " + m);

			// random access element by key
			System.out.println("3 is the correct age for " + m.get(3));
			
			System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demoTreeMap()... done!");
	}
	
	public void demoArrayQueue() {
		Queue<String> q = new ArrayDeque<>();		// FIFO
//		Queue<String> q = new PriorityQueue<>();	// natural order
		q.add("Jim");
		q.add("Jon");
		q.add("Jan");
		
		System.out.println(q.size() + " elements in ArrayQueue container");
		for (String name: q) {
			System.out.print(name +", ");
		}
		System.out.println();
//		Collections.sort(q);		// can't sort ArrayQueue
//		List<String> l =  new LinkedList<>(q);
		List<String> l =  new ArrayList<>(q);
		
		System.out.println("Show removal order from ArrayQueue (FIFO): ");
		System.out.print(q.remove() + ", ");
		System.out.print(q.remove() + ", ");
		System.out.println(q.remove() + ", ");

		Collections.sort(l);
		System.out.println(l.size() + " elements in sorted List container");
		for (String name: l) {
			System.out.print(name +", ");
		}
		System.out.println();
		int i = 0;
	}
	
	public void demoPriorityQueue() {
//		Queue<String> q = new ArrayDeque<>();		// FIFO
		Queue<String> q = new PriorityQueue<>();	// natural order
		q.add("Jim");
		q.add("Jon");
		q.add("Jan");
		
		System.out.println(q.size() + " elements in PriorityQueue container");
		for (String name: q) {
			System.out.print(name +", ");
		}
		System.out.println();
//		Collections.sort(q);		// can't sort PriorityQueue
		List<String> l =  new LinkedList<>(q);
//		List<String> l =  new ArrayList<>(q);
		
		System.out.println("Show removal order from PriorityQueue (Sorted): ");
		System.out.print(q.remove() + ", ");
		System.out.print(q.remove() + ", ");
		System.out.println(q.remove() + ", ");

		Collections.sort(l);
		System.out.println(l.size() + " elements in sorted List container");
		for (String name: l) {
			System.out.print(name +", ");
		}
		System.out.println();
		int i = 0;
	}

	public static void demo() {
		System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demo()...");
		
		DemoDataStructures obj = new DemoDataStructures();
		obj.demoHashTable();
		obj.demoHashMap();
		obj.demoTreeMap();
		obj.demoArrayQueue();
		obj.demoPriorityQueue();

		System.out.println("\n\t" + DemoDataStructures.class.getSimpleName() + ".demo()... done!");
	}

}
