package Assignment;

interface Calculator {
	public void add(int x, int y);
}

public class Demo2 {

	public static void main(String[] args) {
		Calculator cal = new Calculator() {
			public void add(int x, int y) {
				int z = x + y;
				System.out.println(z);
			}
		};
		cal.add(3, 4);
	}

}
