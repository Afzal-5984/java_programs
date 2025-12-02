//set bit 

public class Setbit{
	public static void main(String[] args){
		int n = 57;
		int i = 3;
		int ans = n | (1<<i-1);
		System.out.println(ans);
	}
}