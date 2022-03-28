package array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortTest {

	public static void main(String[] args) {

		Integer[] values = { 69, 44, 55, 67, 19, 4, 89, 20, 51, 82, 34, 12, 9, 22 };
//		int temp = 0;
//
//		for (int i = 0; i < values.length; i++) {
//			
//			for (int j = 0; j < values.length; j++) {
//				if (values[i] < values[j]) {
//					temp = values[i];
//					values[i] = values[j];
//					values[j] = temp;
//				}
//			}
//		}
		
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
		Arrays.sort(values, Collections.reverseOrder());
		System.out.println(Arrays.toString(values));
		
//		for(int i=values.length-1; i>=0; i--) {
//			System.out.print(values[i]+",");
//		}
		
	}

}
