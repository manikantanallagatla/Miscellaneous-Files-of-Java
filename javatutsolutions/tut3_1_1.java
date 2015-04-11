  import java.util.Scanner;
  public class tut3_1_1{
  public static void main(String[] args) {
  	int c[]=new int[10];
  	int i,Searchfor;
  	Scanner in=new Scanner(System.in);
  	for(i=0;i<c.length;i++){
  		System.out.print("enter no with index "+i+" : ");
  		c[i]= in.nextInt();}
  		System.out.print("enter number Searchedfor: ");
  		Searchfor=in.nextInt();
  		 Boolean found=false;
  		 	;
  		int d=0;
  		int j,sum=0;
  		for(j=0;j<c.length;j++){
  			found=false;
  			if(Searchfor==c[j]){
  				found=true;
  				d=1;
  				sum+=1;}
  			  			if(found==true)
  				System.out.println("value found at: "+j);
  				}
  		if(d==0)
  				 System.out.println("value not found");
      System.out.println("no of times searched value present: "+sum);
    }
}
