package Function;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		Function <Integer, Integer> f =i->i*i;
		System.out.println(f.apply(5));
		Function <String, Integer> f1 =i->i.length();
		System.out.println(f1.apply("WElcome"));

	}

}
