/*Q2. Modify the program in Q1. For the following
(i)	class Rectangle having class variables/instance variables for length and width of the rectangle
(ii)	declaring and defining inputDim() method to input dimensions from the keyborad
(iii)       area() method to calculate the area of rectangle with parameters as class variables
(iii)	display() the area of  Rectangle class objects created
Note: use for loop to create multiple objects of the class*/
import java.util.Scanner ;
public class tut2_2 {
	public int length;
	public int breadth;
	public void inputDim(){
    Scanner in=new Scanner(System.in);
	System.out.print("enter length : ");
	length=in.nextInt();
	System.out.print("enter Braedth : ");
	breadth = in.nextInt();
}
public int area(int l,int b){

	int area=l*b;
	return area;}
	public void display(){
		System.out.println("area is "+area(length,breadth));
	}
	public static void main(String []args){
		for(int i=1;i<=3;i++){

			tut2_2 recti=new tut2_2();

		recti.inputDim();

			recti.display();}
		}
	}