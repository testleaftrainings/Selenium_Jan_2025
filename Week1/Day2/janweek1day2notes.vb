Today's Agenda:
---------------
3:00 to 3:45 ---> Conditional Statements
3:45 to 4:00 ---> Breakout+Break
4:00 to 4:45 ---> Control Statements
4:45 to 5:00 ---> Breakout+Break
5:00 to 5:45 ---> Methods & Objects
5:45 to 6:00 ---> Breakout
6:00 to 6:15 --->Recap

### Datatypes:
   1. *Definition:*
       Datatypes specify the type of data a variable can hold. 


       whole numbers
       -------------
       byte-8 bit of data(not used in real time appln)
       int-32 bit(1 to 9 digits)
       short-16 bit(possible to store 5 digits)
       long-64 bit(9+1)

       decimal digits
       --------------
       float-32 bit(upto 6 to 7 decimal digits)
       double-64 bit(upto 15 decimal digits)

       to store single character
       -------------------------
       char
       eg)char name='p'
        
        to store number of characters
        String ="testleaf

        create a project
        ----------------
        1)file--->new--->maven or others--->click on checkbox of create a simple project--->next--->groupid(lowercase)---->artifact id(camelcase)--->finish

Operators:
----------
operators are special symbols that perform specific operations
 
1.Arithmetic operators:
These operators are used to perform mathematical operations
such as addition, subtraction, multiplication,and division.
+ (addition)
- (subtraction)
* (multiplication)
/ (division)-Que
% (modulus or remainder)

2.Assignment operators:
These operators are used to assign values to variables. 
= (assignment)
+= (add and assign)
-= (subtract and assign)
*= (multiply and assign)
/= (divide and assign)
%= (modulus and assign)

3.Comparison operators:
These operators are used to compare two value
and return a boolean value (true or false). 
== (equal to)
!= (not equal to)
> (greater than)
< (less than)
>= (greater than or equal to)
<= (less than or equal to)

4.Logical operators:
These operators are used to combine two or more boolean expressions
and return a boolean value.
&& (logical and) (multiplication)
1 T    0 F
and 1*1 ---1 T
    0*1 ---0  F
	1*0----0 F
	0*0----0 F
(5==5)&&(5<5)---false

|| (logical or)(addition)
addition
1+1---1T
0+1---1T
1+0---1T
0+0---0F
(5==5)||(5<5)---True
! (logical not or negation)
1---0   T F

0---1   F  T
boolean flag=false;
!flag
5. unary operator
Increment operator (++) 
Decrement operator (--)

For Loop:
---------
fixed number of time 

### Conditional Statements:
   1. Conditional statements  are used to control the flow of the program based on certain conditions. These statements allow the program to make decisions and execute different blocks of code depending on whether a specified condition evaluates to true or false. The primary conditional statements in Java include:

### 1. if Statement:

*Definition:*
The if statement is used to execute a block of code only if a specified condition is true.

*Syntax:*
java
if (condition) {
    // Code to be executed if the condition is true
}


### 2. if-else Statement:

*Definition:*
The if-else statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

*Syntax:*
java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}


### 3. if-else if-else Statement:

*Definition:*
The if-else if-else statement allows you to check multiple conditions in sequence. It executes the first block of code whose condition is true.

*Syntax:*
java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions is true
}


### Switch-case statement:

1.  The switch-case statement in Java is a conditional statement used to make decisions based on the value of an expression. 
 - The switch statement evaluates the expression and then compares it against various case values. When a match is found, the associated block of code is executed.

*Syntax:*

java
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // Additional cases as needed
    default:
        // Code to be executed if none of the cases match
}

Key points about the switch-case statement:
1. Expression:
    The expression is evaluated once and its value is then compared with the constant values specified in the case statements.
2. Case Values:
    Each case specifies a constant value that the expression is compared against. If there's a match, the code block following that case is executed.
3. Break Statement:
    The break statement is used to exit the switch statement after a match is found. Without break, the flow of execution would continue to subsequent case statements.
4. Default Case:
    The default case is optional and serves as a fallback if none of the case values match the expression. It is executed when no other matching case is found.

### Differences and Usage of If and Switch case Statements:
1. Number of Conditions:
if: Suitable for handling a relatively small number of conditions or conditions that don't share a common expression.
switch: Especially useful when there are multiple conditions sharing the same expression.
2. Equality Comparison:
if: Allows for complex conditions involving equality, inequality, or other relational operators.
switch: Specifically designed for equality-based comparisons. Each case checks if the expression equals a constant value.
3. Complex Conditions:
if: Provides flexibility to handle more complex conditions with logical operators (AND, OR).
switch: Limited to simple equality conditions; each case checks if the expression equals a specific value.
4. Default Case:
if: No default case; you can handle default behavior with an additional else statement.
switch: Has a built-in default case, which is executed when none of the case values match the expression.


For Loop
------------
//shortcut of for Loop
type for and do ctrl+space
syntax:
for(initalization;condition;iteration){
    //body of statement
}

while Loop
---------
declaration
condition
iteration

Jump Statements:

break Statement: The break statement is used to exit a loop prematurely. When encountered inside a loop,
 it immediately terminates the loop, and the control is transferred to the statement following the loop.

 for (int i = 0; i < 10; i++) {
  //0,1,2,3,4,5
    if (i == 5) {
        break; // Exits the loop when i is 5
    }
    // Code inside the loop
}


continue Statement: The continue statement is used to skip the rest of the code inside a loop for 
the current iteration and move on to the next iteration.

for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue; // Skips the rest of the code for i=5 and continues with the next iteration
    }
    // Code inside the loop
}
//0,1,2,3,4,6,7,8,9

Method:

*A method in Java is a collection of statements that perform a specific task. Methods are defined 
within classes and are used to organize code, make it reusable, and promote modular programming.

*A method typically consists of a method signature, which includes the method name, return type,
 and parameter list, and a method body, which contains the code to be executed when the method is called.

Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything.
 Parameters: Input values passed to the method for processing.


public  static void main(String[] args){

}
Accessmodifier -public
static - common reference
void-return type
main-method name
String[] agrs- input arguments


Normal method:

Accesmodifier returntype methodname(input arguments)

Example:
public class MyClass {
    // Method definition -> UPI
    public void printMessage() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and return type -> Cash 
    public int addNumbers(int a, int b) {
        return a + b;
    }
}



 Object:

An object in Java is an instance of a class. A class is a blueprint or a template that defines the 
structure and behavior of objects. Objects are created based on these class definitions.
variables ,methods

Objects have attributes (fields or properties) and behaviors (methods). The attributes represent
 the state of the object, and the methods define the actions or operations that the object can perform.

syntax:
step 1:
ClassName objectName=new ClassName();

step 2:

objectName.methodName();
