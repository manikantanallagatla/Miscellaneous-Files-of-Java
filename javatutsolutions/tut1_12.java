public class tut1_12{
	public static void main(String[] args){int k=0;
	System.out.println(2);
	for(int i=2;i<100;i++){
			for(int j=2;j<i;j++){
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
	}
}