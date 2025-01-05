package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		
		int marks=50;
		//type if and do ctrl+space
		if (marks>=40) {
			System.out.println("pass");
		}
		if (marks>60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		int marks1=80;
		if (marks1==80) {
			System.out.println("grade 1");
		} else if(marks1<=80){
			System.out.println("fail");
		}
		else if(marks1>90) {
			System.out.println("distinction");
		}
		else {
			System.out.println("out of range");
		}
		}
	}


