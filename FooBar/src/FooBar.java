import java.util.Scanner;

public class FooBar {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {
			if((x % 3 ==0) & (x % 5==0)) {
				System.out.println("FooBar");
			}
			else if (x % 3 == 0) {
				System.out.println("Bar");
			}
			else if (x % 5 == 0) {
				System.out.println("Foo");
			}
			else{
				System.out.println(x);
			}
			x++;}
		
		System.out.println("Give me a number to FooBar: ");
		Scanner userInput = new Scanner(System.in);
		fooBar(userInput.nextInt());
	}
	
	
	public static void fooBar(int x) {
		int i = 1;
		while (i <= x) {
			if((i % 3 ==0) & (i % 5==0)) {
				System.out.println("FooBar");
			}
			else if (i % 3 == 0) {
				System.out.println("Bar");
			}
			else if (i % 5 == 0) {
				System.out.println("Foo");
			}
			else{
				System.out.println(i);
			}
			i++;
	}
}

}