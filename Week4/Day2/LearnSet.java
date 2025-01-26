package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		String str="saran";
		char[] charArray = str.toCharArray();
		
		Set<Character> unique=new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
		System.out.println(unique);

	}

}
