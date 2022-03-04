package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Demo5 {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		arr.add("bike");
		arr.add("car");
		arr.add("scooty");
		arr.add("ven");
		arr.add("bus");
		List<String> s = new ArrayList<String>();
		s = arr.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(s);
		arr.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		arr.stream().map(n -> n.length()+5).forEach(System.out::println);

	}

}
