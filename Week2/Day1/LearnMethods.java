package week2.day1;

public class LearnMethods {
	
	//syntax:access modifier returntype methodname(argmts)
	public int addition(int a,int b,float c,String pass){
		
		System.out.println(a+b+c+" "+pass);
		return a;
		
	}
	private int noOfBicycles(){
		return 3;
	}
	String bicycleData(String brandName,String brandColour,int regNO){
		return brandColour+" "+brandName+" "+regNO;
		
	}
	public static void main(String[] args) {
		//syntax:classname obj=new classname();
		LearnMethods lm=new LearnMethods();
		lm.addition(5, 2, 8.2f, "saranya");
		System.out.println(lm.noOfBicycles());
		String bicycleData = lm.bicycleData("activa", "red", 1234);
		System.out.println(bicycleData);
		
	}
}
