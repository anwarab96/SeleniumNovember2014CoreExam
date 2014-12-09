package loops;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
	//create String array
		String[] strArray = new String[]{"Mohi", "Qtp", "Selenium",
				"Array", "String", "Java", "Length"};
		//Using Arrays.toString method
		String str1 = Arrays.toString(strArray);
		str1= str1.substring(1,str1.length()-1).replaceAll(",","");
		System.out.println("String 1:" + str1);
		/* 
		 * To get length of array,use length property of array.
		 */
		
		int length = strArray.length;
		System.out.println("String array length is: " + length);
		//print elements of an array
		for(int i=0; i<strArray.length; i++)
			System.out.println(" " + strArray[i]);
	}

}
