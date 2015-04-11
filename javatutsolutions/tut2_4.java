import java.util.*;
public class tut2_4{

    public static void main(String[] args) {
        double a,b,c,max=0;

 Scanner input=new Scanner(System.in);
 System.out.print("enter i: ");
 a=input.nextDouble();
 System.out.print("enter j: ");
 b=input.nextDouble();
 System.out.print("enter k: ");
 c=input.nextDouble();
 if(a>b&&a>c)
 max=a      ;
 if(b>a&&b>c)
 	max=b;
 	if(c>a&&c>b)
 		max=c;
 		System.out.println("maximum is "+max);

    }
}
