/*Q3. Modify the program in Q2. For the following
(i)	class Rectangle having class variables/instance variables for length and width of the rectangle
(ii)	declaring and defining instead of inputDim
(a) default constructor
(b) parameterized constructor
(iii)       area() method to calculate the area of rectangle
(iii)	display() the area of  Rectangle class objects created
Note: use for loop to create multiple objects of the class
*/import java.util.Scanner;
public class tut2_3 {
		public int length;
	public int breadth;
	public tut2_3(){
		Scanner in=new Scanner(System.in);
	System.out.print("enter length : ");
	length=in.nextInt();
	System.out.print("enter Braedth : ");
	breadth = in.nextInt();}
	public tut2_3(int l,int b){
    length=l;
    breadth=b;}
public int area(){
	int area=length*breadth;
	return area;}
	public void display(tut2_3 a){
   System.out.println("area is "+a.area());
	}
	public static void main(String []args){

      tut2_3 rect[ ] = new tut2_3[4];
       for (int i = 0; i<4;i++)
       {
       	rect[i] = new tut2_3();
       	rect[i].display(rect[i]);
	}}
}