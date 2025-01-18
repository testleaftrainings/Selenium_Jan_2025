package week3.day3;

public class LearnStrings {

	public static void main(String[] args) {
		/*
		 * Strings--->a collection of characters
		 * dec--->String literal
		 *        2)String instance
		 */
		//Datatype v.name="values"--->syn
		String name="Testleaf";
		String name1="TestLeaf";
		
		//using instance--->D.T obj=new D.T ("Values")
				String str=new String("Testleaf");
				String str1=new String("Testleaf");
		//count the number of characters
		int length = name1.length();
		System.out.println(length);
		//compare two strings---->content of two strings and casesensitive
		boolean equals = str.equals(name);
		System.out.println(equals);
		
		if (str.equals(name)) {
			System.out.println("same");
		} else {
System.out.println("not same");
		}
		
		//==--->check for the memory location
		if (str==name) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		//ignore case sensitive
		boolean equalsIgnoreCase = str.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		//contains--->how to check a character or a word exist or not(case sensitive)
		if (str1.contains("leaf")) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		//toChar array
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		//charAt
		  char charAt = str.charAt(5);
		  System.out.println(charAt);
		  
		//replace
		  String s="Testleaf123";
		  String rep = s.replace("e", "@");
		  System.out.println(rep);
		  //retreive any values
		  String replaceAll = s.replaceAll("[^0-9]", "");
		  System.out.println(replaceAll);
		  String replaceAll2 = s.replaceAll("[^A-z]", "");
		  System.out.println(replaceAll2);
		  
		  //string to integer
		  String ss="123";
		  int stringToInt = Integer.parseInt(ss);
		  System.out.println(stringToInt+10);
		  //split--->a string is splitted into multiple strings
		  String sT="Testleaf and Qeagle";
		  String[] split = sT.split("ea");
		  System.out.println(split[1]);
		  //sT.split("e", 2);
		  for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		  
		  //substring---->crop a string and convert into small strings
		  String sr="january";
		  String subString = sr.substring(2);
		  System.out.println(subString);
		  String substring2 = sr.substring(1, 6);
		  System.out.println( substring2);
		  
		  
		  
		  
		  
		  
		
		
		
		
		
	}

}
