 class MaxVal{
   public int findmax(int a,int b,int c){
   	int max;
   	if(a>b){
   		if(c>a)
   			max=c;
   			else
   				max=a;
   	}
   	else {
   		if(b>c)
   			max=b;
   			else
   				max=c;
   	}
   	return max;
   }
}
public class tut1_2 {
	  public static void main(String[] args) {
        MaxVal a1 = new MaxVal();

        System.out.println("max is  : "+ a1.findmax(10,15,20));
    }
}