
public class FooBar {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {
			if (x % 3 == 0) {
				if (x % 5 == 0) {
					System.out.println("Foo Bar");
				} else {
					System.out.println("Bar");
				}
				
			} else if (x % 5 == 0) {
				if (x % 3 == 0) {
					System.out.println("Foo Bar");
				} else {
					System.out.println("Foo");
				}
			} else {
				System.out.println(x);
			};
			x++;
		}
	}
}
