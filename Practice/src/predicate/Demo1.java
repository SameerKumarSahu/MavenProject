package predicate;

import java.util.function.Predicate;

public class Demo1 {
	//Predicate --> one parameter   return boolean
//use only if you have conditional checks in your program
	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(55));
		Predicate<String> p1 = s->(s.length()>2);
		System.out.println(p1.test("Sameer"));
		String arr[] = {"Sam","Ram","Dam","Jon"};
		
		for(String name: arr) {
			if(p1.test(name)) {
			System.out.println(name);
		}}
	}

}
