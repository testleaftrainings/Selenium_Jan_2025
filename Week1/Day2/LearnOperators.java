package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Arithmetic	
		System.out.println(4/2);
		System.out.println(11%2);
		
		//Assignment--->assignng a value to a variable
		int a=4,b=5;
		a+=5;//a=a+5--->a=4+5=9
		System.out.println(a);
		b-=10;//b=b-10--->5-10-->-5
		System.out.println(b);
		
		//comparison opertors
		System.out.println(7==5);
		//logical 
		System.out.println((7==7)&&(5<5));//1*0=0
		System.out.println((5==5)||(5<5));//1+0=1
		
		//unary operators
		int x=1;
		System.out.println(++x);//2
		System.out.println(x);
		System.out.println(x++);//2
		System.out.println(x);//3
	}

}
