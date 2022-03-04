package Practice;

@FunctionalInterface
interface i {
	public void m1();
}
interface i2 {
	public String m2(String source, String destination);
}

public class Lambda {

	public static void main(String[] args) {

		i m = () -> System.out.println("Welcome");
		m.m1();
		i2 j = (source,destination) ->{ System.out.println("Ola Cab is booked from "+source+" to "+destination);
		return ("Price is 2000");
		};
		System.out.println(j.m2("Hyderabd","Mumbai"));
	}

}
