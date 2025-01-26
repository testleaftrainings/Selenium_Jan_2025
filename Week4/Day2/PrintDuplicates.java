package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		int num[]= {2,4,5,7,2,4,6,7};
		//output--->2,4,7
		//declare an empty set
		//syn:interface <wrapperclass> variable=new imp.class<wrapperclass>();
		Set<Integer> unique=new TreeSet<Integer>();
		Set<Integer> duplicates=new HashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			 boolean b = unique.add(num[i]);
			 if (!b) {
				duplicates.add(num[i]);
			}
		}
		
		System.out.println("unique elements :"+unique);
		System.out.println("duplicates are:"+duplicates);
			
	}

}
