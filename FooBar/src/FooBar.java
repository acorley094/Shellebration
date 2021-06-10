
public class FooBar {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {
			System.out.println(x);
			if (x % 3 == 0) {
				System.out.println("Bar");
			};
			if (x % 5 == 0) {
				System.out.println("Foo");
			};
			x++;
		}
	}
}
