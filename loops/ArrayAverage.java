package loops;

import org.junit.Test;

public class ArrayAverage {
	@Test
	public static void main(String[] args) {
		//define an array
	int [] numbers = new int[]{10,20,40,50,20,10,50,30,20,10,56,34,45,67};
	//calculate sum of all array elements
	int sum = 0;
	for(int i = 0; i<numbers.length; i++ )
		sum = sum + numbers[i];
	System.out.println("Sum is " + sum);
	//Calculate average value
	double average = sum/numbers.length;
	System.out.println("Average value of array elements is: " + average);
	}

}
