//count flip 

public class Countflip {
	public static void main(String[] args){
		int a =7;
		int b =8;
		int count=0;
		int c = a^b;
		while (c>0){
			if ((c&1)==1){
				count++;
			}
	     c>>=1;
		}
	    System.out.println(count);	
	}
}