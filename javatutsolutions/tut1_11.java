
public class tut1_11 {
    public static void main(String[] args) {
         int a,b,c,d,e;
        for(a=0;a<10;a++)
        	for(b=0;b<10;b++)
        		for(c=0;c<10;c++)
        		{	d=a*a*a+b*b*b+c*c*c;
        			e=100*a+10*b+1*c;
        			if(d==e)
        			System.out.println(d);
        				if( d>1000)
        					break;}
    }
}
