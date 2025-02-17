package week7.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x=4;
		int y=2;
		int num[]= {1,2,3};//0,1,2
		try {
			System.out.println(x/y);
			System.out.println(num[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
		/*
		 * try { System.out.println(num[3]);
		 * 
		 * }
		 */
		 
		
		  catch(Exception e) { System.out.println(e); }
		 
		System.out.println("done");
		

	}

}
