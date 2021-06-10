import java.util.Scanner; // imports Scanner Object to grab user input

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
		// create new Scanner object called 'userInput' -> (System.in) is user input
		Scanner userInput = new Scanner(System.in); 
		fooBar(userInput.nextInt()); //userInput.nextInt() looks for a new int from the user
	}
	
	//Bonus----
	public static void fooBar(int userInput) {	//same function, just takes an int for the end number
		int i = 1;
		while (i <= userInput) { 
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