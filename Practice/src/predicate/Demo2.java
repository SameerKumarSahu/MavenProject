package predicate;

import java.util.function.Predicate;

//joining predicates and . or negate
//p1  ----check even number 
//p2   ----check greater than 50

public class Demo2 {
	public static void main(String[] args) {
		int arr []= {2,66,7,4,534,33,22,88,77,345};
		Predicate <Integer> p =i->(i%2==0);
		Predicate <Integer> p2 =i->(i>30);
		for(int a :arr) {
//			if(p.and(p2).test(a))
//				System.out.println(a);
//			if(p.or(p2).test(a))
//				System.out.println(a);
			if(p.negate().test(a))
				System.out.println(a);
		}
	}

}
