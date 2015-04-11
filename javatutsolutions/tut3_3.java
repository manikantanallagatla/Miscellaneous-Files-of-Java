import java.util.Scanner;
public class tut3_3 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
double c[]=new double[10];
double d[]=new double[10];
int i;
	for(i=0;i<c.length;i++){
  		System.out.print("enter no with index "+i+": ");
  		c[i]= in.nextDouble();}
  		int j,k=0;
  		for(j=0;j<c.length;j++){
  		 k=j;
  				d[9-k]=c[j];
  				}	System.out.print("{");
  				for(int x=0;x<c.length;x++){
  			  	System.out.print(d[x]+",");
            	} System.out.print("}");


}
}
