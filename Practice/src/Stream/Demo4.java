package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Demo4 {

	public static void main(String[] args) {

		List<Product> arr = new ArrayList<>();
		arr.add(new Product(1,"HP",25000));
		arr.add(new Product(2,"DELL",30000));
		arr.add(new Product(3,"ACER",40000));
		arr.add(new Product(4,"Lenovo",15000));
		arr.add(new Product(5,"Samsung",60000));
		List<Product> na = new ArrayList<Product>();
		na = arr.stream().filter(n -> n.price >20000).collect(Collectors.toList());
		System.out.println(na);
		arr.stream().filter(n -> n.price >25000).forEach(n -> System.out.println(n.name));
		arr.stream().filter(n -> n.price >30000).forEach(System.out::println);

	}

}
