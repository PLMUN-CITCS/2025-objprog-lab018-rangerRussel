import java.util.Scanner;

public class EvenOddChecker {
	public static void checkEvenOrOdd(int number) {
	   if (number % 2 == 0 ) {
		System.out.println(number + " is an EVEN number.");
	}
	  else {
		System.out.println(number + " is an ODD number.");
	}

}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
 		int getIntegerInput = scanner.nextInt();

 		checkEvenOrOdd(getIntegerInput);

 	scanner.close();
	}
}
