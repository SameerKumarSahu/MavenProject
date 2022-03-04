package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {
	int sid;
	String sname;
	char grade;

	Student(int sid, String sname, char grade) {
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}

}

public class Flatmap {

	public static void main(String[] args) {

		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student(1, "Ram", 'A'));
		stu.add(new Student(2, "Sam", 'B'));
		stu.add(new Student(3, "Ham", 'C'));
		stu.add(new Student(4, "Dam", 'D'));
		List<Student> stu2 = new ArrayList<Student>();
		stu2.add(new Student(5, "Ram", 'E'));
		stu2.add(new Student(6, "Sam", 'F'));
		stu2.add(new Student(7, "Ham", 'G'));
		stu2.add(new Student(8, "Dam", 'H'));
		List<List<Student>> fianlList1 = Arrays.asList(stu, stu2);
		List<String> finalResult1 = fianlList1.stream().flatMap(n -> n.stream()).map(x -> x.sname)
				.collect(Collectors.toList());
		System.out.println(finalResult1);
		// ===================================================
		List<Integer> emp = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> e = emp.stream().map(n -> n + 5).collect(Collectors.toList());
		System.out.println(e);
		// ================================================
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);
		List<List<Integer>> fianlList = Arrays.asList(list1, list2, list3);
		List<Integer> finalResult = fianlList.stream().flatMap(n -> n.stream().map(x -> x + 5))
				.collect(Collectors.toList());
		System.out.println(finalResult);
		// =============================================
		List<String> teamA = Arrays.asList("A", "B", "C");
		List<String> teamB = Arrays.asList("D", "E", "F");
		List<String> teamC = Arrays.asList("G", "H", "I");
		List<List<String>> totalPlayer = new ArrayList<List<String>>();
		totalPlayer.add(teamA);
		totalPlayer.add(teamB);
		totalPlayer.add(teamC);
		for (List<String> team : totalPlayer) {
			for (String name : team) {
				System.out.print(name + " ");
			}
		}
		List<String> names = totalPlayer.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println("\n" + names);
		//===========================================
		List<Integer>num=Arrays.asList(22,22,33,44,12,32,55,33,44);
		num.stream().distinct().forEach(x->System.out.print(x+" "));
		//==================================
		long count =num.stream().distinct().count();
		System.out.println("\n"+count);
		//===========================================
		List<Integer>list=num.stream().limit(3).collect(Collectors.toList());
		System.out.println(list);
		//=====================================
		Optional<Integer>min=num.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min.get());
		//=======================================
		Optional<Integer>max=num.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
		//================================================
		Object arr[]=num.stream().toArray();
		System.out.println(arr.length);
		for(Object b:arr) {
			System.out.println(b);
		}
	}

}
