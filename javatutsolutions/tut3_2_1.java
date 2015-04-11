          import java.util.Scanner;
          public class tut3_2_1{
          public static void main(String[] args) {
          int c[]=new int[10];
  	int i,Searchfor;
  	Scanner in=new Scanner(System.in);
  	for(i=0;i<c.length;i++){
  		System.out.print("enter no with index "+i+": ");
  		c[i]= in.nextInt();}
  		int j,postive=0;
  		for(j=0;j<c.length;j++){
  			if(c[j]>0)
  				postive+=1;	}
  				int k,negative=0;
  		for(j=0;j<c.length;j++){
  			if(c[j]<0)
  				negative+=1;
  			  		  		}
  	   System.out.println(postive+" are postive & "+negative+"  are negative" );
  	   int a,even=0,odd=0;
  	   for(a=0;a<c.length;a++){
  	   	if(c[a]%2==0){
  	   		even+=1;
  	   	} odd=c.length-even;
  	   }
  	   System.out.println(even+" are even & " +odd +" are odd");
  	   	  	           }
}
