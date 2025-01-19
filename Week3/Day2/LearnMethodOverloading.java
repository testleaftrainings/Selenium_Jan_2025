package week3.day2;

public class LearnMethodOverloading {
	/*
	 * the method signature is same but with diff argmts and with different datatypes
	 * staic/compiletime/early binding
	 */
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void add(int a,float b,int c) {
		System.out.println(a+b+c);
	}
	public void add(int a,int c) {
		System.out.println(a+c);
	}
	public static void main(String[] args) {
		LearnMethodOverloading lm=new LearnMethodOverloading();
		lm.add();
		lm.add(5, 10);
	}
}
