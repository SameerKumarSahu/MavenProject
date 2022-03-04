package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employe {
	int eid;
	String ename;
	int salary;

	Employe(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
}

public class Demo6 {

	public static void main(String[] args) {

		List<Employe> emp=Arrays.asList( 
				new Employe(1,"Ram",10000),
				new Employe(2,"Sam",20000),
				new Employe(3,"Ham",30000),
				new Employe(4,"Dam",40000));
		List<Integer>e =emp.stream().filter(n->n.salary>15000).
				map(n->n.salary+5000).collect(Collectors.toList());
		System.out.println(e);
				
	}

}
