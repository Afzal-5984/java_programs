//get bit

public class Getbit{
	public static void main(String[] args){
		int n =12 ;
		int i = 3;
		int ans = n & (1<<i-1);
		if (ans == 0){
			System.out.println("not set bit");
		}
		else {
			System.out.println("set bit");
		}
	}
}