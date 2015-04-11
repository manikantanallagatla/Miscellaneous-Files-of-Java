import java.util.*;
public class tut1_17{

    public static void main(String[] args) {
         int i=0,j,k=0;
         boolean found=true;
                 Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        j=in.nextInt();
        	for(int m=2;m<j;i++){
			for(int t=2;t<i;j++){
				if(i%j==0){
					k=0;
					break;
				}
			k=j;
			}
		if(k==i-1){
			System.out.println(i);
		}
    }
    }    }