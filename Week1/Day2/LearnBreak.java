package week1.day2;

public class LearnBreak {

	public static void main(String[] args) {
		
		//terminates the iteration--->print the numbers from 1 to 10.
		
		//when finding the number as 3 which is in words stop the iteration
		
		for (int i = 1; i <=10 ; i++) {
			
			if (i==3) {
				System.out.println("three");
				break;
			}
			System.out.println(i);
		}
	}

}
