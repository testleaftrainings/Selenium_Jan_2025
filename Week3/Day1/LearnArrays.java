package week3.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/*
		 * Arrays--->collection of items of same datatype
		 * ArrayLiteral--->datatype variablename[]={values}---->based on dat
		 * array indexout of bound exception
		 * Array Instantiation--->D.t [] obj=new D.t[size]-->based on size
		 */
		int[] marks= {89,78,99,98,97,65};//index starts from 0
		//length of the array
		int arrLength = marks.length;
		System.out.println(arrLength);//length always starts from 1
		//iterate all values
		/*for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);*/
		//sort an array
			Arrays.sort(marks);//{65,78,89,97,98,99}
			System.out.println(marks[4]);
			
			//System.out.println(marks[i]);
			for (int j= 0; j < arrLength; j++) {
				System.out.println("marks after sorting:"+marks[j]);
				
			//maximum value	
			}
			System.out.println(marks[arrLength-1]);
			
			int [] marks1=new int[5];
			System.out.println("values from inst:"+marks1[2]);
			marks[0]=98;
			marks[1]=76;
			
			String[] mentors=new String[3];
			System.out.println(mentors[2]);
			
		}
		
	}



