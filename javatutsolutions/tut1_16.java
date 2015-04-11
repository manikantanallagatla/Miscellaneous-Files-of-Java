
public class tut1_16 {
    public static int power(double x,int y){
    	int j=1;
    for(int i=1;i<=y;i++){
    	j*=x;}
    	    return j;
    }
    public static void main(String[] args) {
        double k = power(3.2,4);
        System.out.println(k);
    }
}
