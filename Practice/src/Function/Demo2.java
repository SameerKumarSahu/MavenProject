package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;

	Employee(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Ram", 10000));
		al.add(new Employee("Sam", 20000));
		al.add(new Employee("Jon", 40600));
		al.add(new Employee("Ron", 30000));
		Function<Employee, Integer> f3 = e -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000)
				return sal * 10 / 100;
			else if (sal >= 20000 && sal <= 30000)
				return sal * 20 / 100;
			else
				return sal * 40 / 100;
		};
		Predicate <Integer> p=i->(i>1500);
		for(Employee emp:al) {
			int bonus=f3.apply(emp);
			if(p.test(bonus))
			System.out.println(emp.ename+"  "+emp.salary+"  "+bonus);
		}
		//Function Chaining---> andThen() compose()
		Function<Integer,Integer> f4=n->n*2;
		Function<Integer,Integer> f5=n->n*n*n;
		System.out.println(f4.andThen(f5).apply(2));
		System.out.println(f4.compose(f5).apply(2));
		
	}

}
