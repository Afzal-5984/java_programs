//clear bit 
public class Clearbit{
	public static void main (String[] args){
		int n =17 ;
		int i = 5;
		int ans = n & ~(1<<i-1);
		System.out.println(ans);
	}
}