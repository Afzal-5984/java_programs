//Even odd program 
/*public class Evenoddprogram{
	public static void main (String[] args){
		int number = 9;
		if (number%2 == 0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}*/

//2nd approach by using binary operator.
/*public class Evenoddprogram {
	public static void main (String[] args){
		int a = 70;
		if ((a&1) == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}*/

//3rd approach by using ternary operators(?,:).
public class Evenoddprogram {
	public static void main (String[] args){
		int a = 0;
		System.out.println((a&1)==0 ? "Even" : "Odd");
	/*	boolean b = (a&1)==0 ? true : false ;
		System.out.println(b);
		int i = (a&1)==0 ? 0 : 1;
		System.out.println(i);	
	}*/
	}
}
