import java.util.*;
public class tut2_4_1{

        public static void main(String[] args) {
         double a,b,c,max=0;

 Scanner input=new Scanner(System.in);
 System.out.print("enter a: ");
 a=input.nextDouble();
 System.out.print("enter b: ");
 b=input.nextDouble();
 System.out.print("enter c: ");
 c=input.nextDouble();
 if(a>b){
 	if(a>c)
 	System.out.println("maximum is a ");
 	else
 		System.out.println("maximum is c");
 		 }	else if(b>c)
 		 	System.out.println("maximum is b");
else
System.out.println("maximum is c");
    }
}
