public class tut3_4 {
	 public int[] update(int a[]){
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++){
		b[i]=a[i]*2;}
		return b;
				}
	     public static void main(String[] args) {
	     	tut3_4 obj1=new tut3_4();
	     	int a[]={1,2,3,4,5,6,7,8,9};
	     	a=obj1.update(a);
                      for(int c:a){

       	System.out.println(c);
	     }

    }

}