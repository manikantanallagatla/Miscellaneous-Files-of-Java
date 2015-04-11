import java.util.Scanner;
public class tut1_14{
	public static int fact(int a){
		int b=1;
		for(int c=1;c<=a;c++){
			b=b*c;
		}
		return b;
	}
				    public static void main(String[] args) {
    	double y,x,k;
    	int a;
    Scanner in = new Scanner(System.in);
    System.out.print("enter the angle : ");
    y=in.nextDouble();
    x=(y/180)*Math.PI;
    System.out.print("no of terms : ");
    a=in.nextInt();
    double o = Math.sin(x);
    System.out.println(o);
    	double z=0;
		for(int i=1;i<=(2*a-1);i++){
			if(i%2!=0)
		z=z+((Math.pow(-1,(i-1)/2))*(Math.pow(x,i))/(fact(i)));
		}
      k=((o-z)/o)*100;
    	    System.out.println("percentage error is : "+k+"%");
    }
}
