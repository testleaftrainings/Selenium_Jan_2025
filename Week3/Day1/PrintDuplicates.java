package week3.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int num[]= {3,4,3,5,4,6};
		//length of the array
		int length = num.length;
		System.out.println("length of array is:"+length);
		//sorting
		Arrays.sort(num);//{3,3,4,4,5,6}
		System.out.println("arrays after sorting:"+num);
		//print the values
		for (int i = 0; i < num.length-1; i++) {
			if (num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
			
		}
		
		
	}

}
