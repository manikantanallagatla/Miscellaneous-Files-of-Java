/*
Q6. The X and Y coordinates of 10 different points are entered through the keyboard.
 Write a program to find the length of path from first to last point via rest of them in the given order.
  You should design a method which can be reused to find distance between two give points.
*/
import java.util.Scanner;
public class tut3_6 {
	public static double distance(int a[],int b[]){
			double d=0;
		for(int i=0;i<a.length;i++){
         d=d+Math.pow((a[i]-b[i]),2);}
          //if(d>=0)
          	d=Math.sqrt(d);
          	//else
          	//	d=Math.sqrt(-d);

		        return d;
		}
	public static void main( String[]args){
	int p[][] = new int [10][2];
	Scanner in = new Scanner(System.in);
	for(int i=0;i<10;i++){
		System.out.println("enter point  :"+(i+1));
		for(int j=0;j<2;j++){
			p[i][j]=in.nextInt();
		}
			}
			double d=0;
		for(int i=0;i<9;i++){
	 d = d+distance(p[i],p[i+1]);
			}
System.out.println(d);}}