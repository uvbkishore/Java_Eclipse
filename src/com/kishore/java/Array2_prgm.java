package com.kishore.java;
import java.util.Arrays;
public class Array2_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = { 10,20,45,78,9,23};
Arrays.sort(numbers);
System.out.println("Sorted Array: " + Arrays.toString(numbers));
int index = Arrays.binarySearch(numbers, 23);

if(index > 0) {
	System.out.println("Element found at index:" + index);
}else {
	System.out.println("23 Not found");
}

int min = numbers[0];
System.out.println("Minimum:" + min);
int max = numbers[numbers.length - 1];
System.out.println("Maximum" + max);
//

System.out.println("Original Array: " + Arrays.toString(numbers));
for(int i = numbers.length - 1; i >= 0; i--) {
  	System.out.print(numbers[i] + " ");
} // ths end of brace is when i-- will happen from 5 to 4 thats why print is showing 

}
}