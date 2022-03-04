package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> arr = Arrays.asList("Ram","Sam","Jon","Rabi","Hari","Ramesh");
		List<String> name = new ArrayList<String>();
		name=arr.stream().filter(n->n.length()>3).collect(Collectors.toList());
		System.out.println(name);
		arr.stream().filter(n->n.length()>3 && n.length()>4).forEach(n->System.out.println(n));
		arr.stream().filter(n->n.length()>3).forEach(System.out::println);
		
	}

}
