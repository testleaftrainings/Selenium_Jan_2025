package week7.day2;

public class LearnConstructor {
	/**
	 * Costructor:
	 *     -used to initialize the objects
	 *     -constructor and mtd look like same difference is constructor will not have the return type
	 *     -classname and constructor name shld be same.
	 *     types:
	 *     1.default constructor-->with no args
	 *     2.parameterized constructor(costructor overloading)
	 *     -this keyword is used to differentiate the local and global variables
	 *     can you call one constructor from another constructor?
	 *     Yes.we can---->constructor chaining(this)
	 *     
	 *     
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		this(100,"saranya",true);
		
		System.out.println("default constructor");
		empId=98;
		
		
	}
	
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		
		System.out.println("parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		  LearnConstructor lc=new LearnConstructor();
		  System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 
		/*
		 * LearnConstructor lc1=new LearnConstructor(98, "saran", true);
		 * System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 */
		
	}

}
