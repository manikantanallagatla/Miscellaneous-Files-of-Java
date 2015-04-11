public class tut3_7{
	public static void main(String[] args){
		int[] array  =  {1,3,8,1,4,5,7,9,2,10};
		int[] c = transform(array,array.length);
		for(int i= 0;i<c.length;i++){
			System.out.print(c[i] + " ");
		}
	}
	public static int[] transform(int[] a,int size){
		int[] b = new int[size];
		for(int i=0;i<size;i++){
			b[i] = a[i];
		}
		for(int i = (size-1);i>=0;i--){
			for(int j=0;j<i;j++){
				if(b[j]<b[j+1]){
				int	t = b[j+1];
					b[j+1] = b[j];
					b[j] = t;
				}
			}
		}
		return b;
	}
}