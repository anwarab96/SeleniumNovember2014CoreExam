package Variables;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//for String 
	String text = scan.nextLine();
	System.out.println(text);
	
	//for int 
	int num= scan.nextInt();
	System.out.println(num);
	}

}
