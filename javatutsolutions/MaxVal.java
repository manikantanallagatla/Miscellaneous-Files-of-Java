
public class MaxVal {
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