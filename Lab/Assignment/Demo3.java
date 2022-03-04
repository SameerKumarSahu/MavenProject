package Assignment;

interface I {
	public void add1(int x, int y);

	public default void add2(int a, int b) {
		System.out.println(a + b);
	}

	public static void add3(int a, int b) {
		System.out.println(a + b);
	}
}
class D implements I{
	public void add1(int x, int y) {
		System.out.println(x+y);
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		D d= new D();
		d.add1(1, 2);
		I i = new I() {
			public void add1(int x, int y) {
				int z = x + y;
				System.out.println(z);
			}
		};
		i.add1(3, 4);
		i.add2(5, 6);
		I.add3(7, 8);
	}

}
