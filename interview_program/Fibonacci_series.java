//fibonacci series

public class Fibonacci_series {
	public static void main(String[] args){
		int n3 = 16;
		int a =0;
		int b =1;
		System.out.println("using while "+a);
		System.out.println("using while "+b);
		n3=n3-2;
		while (n3>0){
			int sum = a+b;
			System.out.println("using while "+sum);
			a =b ;
			b= sum ;
			n3--;
		}System.out.println("-----------------------------");
		fibonacci2_no();
}
 public static void fibonacci2_no(){
		int n4 = 8;
		int a1 =0;
		int b1 =1;
		System.out.println("using for "+a1);
		System.out.println("using for "+b1);
		n4=n4-2;
		for (int i =1 ; i<=n4 ; i++ )
		{
			int sum1 = a1+b1 ;
			System.out.println("using for "+sum1);
			a1 =  b1;
			b1 = sum1;
		}

}
}