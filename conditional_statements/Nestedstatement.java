//nested statements:

public class Nestedstatement{
	public static void main (String[] args){
		int a = 7 ;//90,8,73,7
		if ((a&1)==0){
			if (a>10){
				System.out.println("a is even and greater than 10");
			}
			else {
				System.out.println("a is even but less than 10");
			}
		}
		else {
			if (a>10){
				System.out.println("a is odd and greater than 10");
			}
			else {
				System.out.println("a is odd but less than 10");
			}
		}
	}
}
