//program for swap numbers:

public class Swaptwonumber{
	public static void main (String[] args){
//1st approach swap of two numbers.
		/*int a =	5;
		int b = 3;
		int c = a ;
		a = b ;
		b = c ;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a="+a + " " + " b="+b);
		*/
		//2nd approach of swap of two numbers.
		/*int a = 5 ;
		int b = 3 ;
		a = a+b;
		b = a-b;
		a= a-b;
		System.out.println("a="+a + " " + " b="+b);*/
	    //3rd approach of swap of two numbers.
		int a = 5 ;
		int b = 3 ;
		a = a^b ;
		b = a^b;
		a = a^b ;
		System.out.println("a="+a + " " + " b="+b);

	}
}