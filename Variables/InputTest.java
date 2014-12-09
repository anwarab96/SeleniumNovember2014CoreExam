package Variables;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//get first input
		System.out.println("What is your name");
		String name = scan.nextLine();
		//get second input
		System.out.println("How old are you ");
		int age = scan.nextInt();
		//display output on console
		System.out.println("Hello, "+ name  + "next year, you will be "
				+ (age + 1));

	}

}
