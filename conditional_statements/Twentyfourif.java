//conditional statements (if ,if else ,If else if else,nested if ,)
//if statements
//public class Twentyfourif {
	/*public static void main (String[] args){
	int a = 6;
	if (a>5)
	{
		System.out.println ("a is greater than 5");
		}
	}
}*/
/*public class Twentyfourif {
	public static void main (String[] args){
	 int a = 4;
	 if (a>5){
	 System.out.println("a is greater than 5");
	 }
	 else {
		 System.out.println("a is not greater than 5");
	 }
	}
}*/
//even odd program.	
/*public class Twentyfourif {
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
/*public class Twentyfourif {
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
/*public class Twentyfourif {
	public static void main (String[] args){
		int a = 0;
		System.out.println((a&1)==0 ? "Even" : "Odd");
	/*	boolean b = (a&1)==0 ? true : false ;
		System.out.println(b);
		int i = (a&1)==0 ? 0 : 1;
		System.out.println(i);	
	}
}*/

//if user enters 0 then last running code output is even but the zero is nutral so ,we will write below code.
/*public class Twentyfourif {
	public static void main (String[] args){
		int a=3;
		if (a==0){
			System.out.println("Zero");
		}
		else if ((a&1)== 0) {
			System.out.println("Even");
		}
		else {
		System.out.println("Odd");
		}
	}
}*/

public class Twentyfourif{
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
