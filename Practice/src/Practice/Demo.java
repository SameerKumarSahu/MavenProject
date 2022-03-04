package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(45);
		al.add(34);

		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.contains(34));
		for (int i : al) {
			System.out.println(i);
		}
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// addAll and removeAll are used to add or remove element in one collection to
		// another
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(12);
		al2.add(15);
		al2.add(11);
		al2.add(14);
		al2.add(17);
		al2.add(18);
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.addAll(al2);
		System.out.println(al3);
		Collections.sort(al3, Collections.reverseOrder());
		System.out.println(al3);
		Collections.shuffle(al3);
		System.out.println(al3);
		int arr[] = { 1, 3, 4, 5, 6, 7 };
		ArrayList a = new ArrayList(Arrays.asList(arr));
		System.out.println(a);
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(52);
		hs.add(125);
		hs.add(122);
		hs.add(112);
		System.out.println(hs);
		hs.remove(112);
		System.out.println(hs);
		System.out.println(hs.equals(al3));
		System.out.println(hs.hashCode());
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(12);
		lhs.add(22);
		lhs.add(42);
		lhs.add(52);
		lhs.add(32);
		// duplicate allowed and insertion order is preserved
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		q.add(1);
		q.add(10);
		q.add(100);
		q.add(1000);

		System.out.println(q.element());// return head element
		// if the queue is empty then it will return exception
		System.out.println(q.peek());// return head element
		// if the queue is empty it will return null
		System.out.println(q.remove(1));
		System.out.println(q.poll());
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "A");
		h.put(2, "B");
		h.put(3, "C");
		h.put(4, "D");
		h.put(5, "E");
		h.put(6, "F");
		h.put(7, "G");
		System.out.println(h);
		System.out.println(h.get(5));
		h.remove(7);//remove the pair
		System.out.println(h.containsKey(6));
		System.out.println(h.containsValue("D"));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		//h.clear();// it will clear the entire HashMap
		System.out.println(h.keySet());//return in set format
		System.out.println(h.values());// return in form of collection object
		System.out.println(h.entrySet());// return in form of set
		for(int j:h.keySet()) {
			System.out.println(j);
		}
		for(String j:h.values()) {
			System.out.println(j);
		}
		for(int j:h.keySet()) {
			System.out.println(j+" "+h.get(j));
		}
		//Entry Methods
		for(Map.Entry entry:h.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		Set s = h.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());  
		}
		Hashtable <Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		ht.put(6, "F");
		ht.put(7, "G");
		ht.get(1);// return value
		ht.remove(7);//remove pair
		ht.contains(1);
		ht.containsKey(3);
		ht.containsValue("G");
		ht.isEmpty();
		ht.keySet();//all the keys from the hashtable
		ht.values();//all the values from the hashtable
		
	}

}
