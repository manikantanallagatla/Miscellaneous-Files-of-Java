/*Q1. Write a test driver class Rectangle with access modifier as public without any class variables/instance variables
 * (a test driver class contains a main method, objects constructed and used in the class)

Within the class Rectangle, declare and define the following methods (non-static) with appropriate access modifiers
and return types so that objects instantiated for the class Rectangle are able to access them:
(i)	area() for reading input from the keyboard for dimensions of the rectangle and thus calculating the area
 against an instantiated object of the class Rectangle
(ii)	display() the area of the against an instantiated object of the class Rectangle

Note: Instantiate or create at least two objects in the test driver class to be initialized by using automatic default constructor
*/import java.util.Scanner;
public class tut2_1 {
public int area(){
	Scanner input = new Scanner(System.in);
	System.out.print("enter length : ");
	int l=input.nextInt();
	System.out.print("enter breadth : ");
	int b=input.nextInt();
    int area = l*b;
    return area;
    }
	public void display(){
    System.out.println("area is = "+area());}
    public static void main(String []args){
    	tut2_1 rect1=new tut2_1();
    	tut2_1 rect2=new tut2_1();
    	rect1.display();
    	rect2.display();
    }
}