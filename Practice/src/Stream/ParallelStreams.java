package Stream;

import java.util.Arrays;
import java.util.List;

class Students {
	
	String sname;
	int score;

	Students( String sname, int score) {
		
		this.sname = sname;
		this.score = score;
	}
	public String getName() {return this.sname;}
	public int getScore() {return this.score;}

}
public class ParallelStreams {

	public static void main(String[] args) {
		List<Students> stu = Arrays.asList(
		new Students("Ram", 67),
		new Students("Sam", 55),
		new Students("Ham", 44),
		new Students("Dam", 88),
		new Students("Ram", 67),
		new Students("Sam", 55),
		new Students("Ham", 44),
		new Students("Dam", 88));
		stu.stream().filter(x->x.getScore()>=66)
		.limit(3)
		.forEach(stud->System.out.println(stud.getName()+"  "+stud.getScore()));
		System.out.println("==============================");
		stu.parallelStream().filter(x->x.getScore()>=66)
		.limit(3)
		.forEach(stud->System.out.println(stud.getName()+"  "+stud.getScore()));
		
		System.out.println("==============================");
		//convert stream()---> parallelStream()
		stu.stream().parallel().filter(x->x.getScore()>=66)
		.limit(3)
		.forEach(stud->System.out.println(stud.getName()+"  "+stud.getScore()));
	}

}
