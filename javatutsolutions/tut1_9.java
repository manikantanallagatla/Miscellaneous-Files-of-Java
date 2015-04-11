
public class tut1_9 {

        public static void main(String[] args) {
        int i,j=0,k=0;
        for(i=4567;i>0;i=i/10){

        	k=i%10;
        	j=10*j+k;

        }
        System.out.println("Reverse of the given number = "+j);
    }
}
