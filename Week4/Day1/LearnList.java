package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/*
		 * syntax:interface <wrapperclass> variable=new imp.class<wrapperclass>
		 */
		
		//Declare a list
		List<String> mentors=new ArrayList<String>();
		//add items in the list
		mentors.add("udhay");//index starts from 0,length starts from 1
		//System.out.println(mentors);
		mentors.add("muthu");
		mentors.add(1, "mukesh");
		//System.out.println(mentors);
		mentors.add(1, "vinoth");
		//System.out.println(mentors);
		mentors.remove(1);
		System.out.println(mentors);
		
		//size of list
		int size = mentors.size();
		System.out.println(size);
		
		//retrieve a particlar item
		String retrieve = mentors.get(2);
		System.out.println(retrieve);
		mentors.clear();
		System.out.println(mentors);
		
		
		
		
	}

}
