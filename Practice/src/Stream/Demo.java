package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(52);
		al.add(91);
		al.add(126);
		al.add(93);
		al.add(123);
		List<Integer> arr = Arrays.asList(10, 32, 35, 79, 43);
		List<Integer> evenNum = new ArrayList<Integer>();
		evenNum=arr.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		arr.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		arr.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
