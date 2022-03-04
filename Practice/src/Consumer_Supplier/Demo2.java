package Consumer_Supplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	String gender;

	Employee(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Ram", 30000, "Male"));
		al.add(new Employee("Sam", 60000, "Male"));
		al.add(new Employee("Dam", 40000, "Male"));
		al.add(new Employee("Jam", 90000, "Male"));
		Function<Employee, Integer> f = emp -> (emp.salary * 10) / 100;
		Predicate<Integer> p = b -> b >= 5000;
		Consumer<Employee> c = emp -> {
			System.out.print(emp.ename + "  " + emp.salary + "  " + emp.gender);
		};
		for (Employee e : al) {
			int bonus = f.apply(e);
			if (p.test(bonus)) {
				c.accept(e);
				System.out.print("   "+bonus+"\n");
			}
		}
	}

}
