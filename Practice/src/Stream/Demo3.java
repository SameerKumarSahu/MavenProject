package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		
		List<String> arr = Arrays.asList("Ram","Sam",null,"Rabi","Hari","Ramesh",null,null);
		List<String> name = new ArrayList<String>();
		name=arr.stream().filter(n->n!=null).collect(Collectors.toList());
		System.out.println(name);
		arr.stream().filter(n->n!=null).forEach(n->System.out.println(n));
		arr.stream().filter(n->n!=null).forEach(System.out::println);
		
	}

}
