//Binary operators:-
//(AND ,OR,EX-OR,~,a>>,a<<)
public class Binary {
	public static void main (String[] args){
		int c = 5;
		int d = 3;
		System.out.println(c&d);//1
		System.out.println(c|d);//7
		System.out.println(c^d);//6
		System.out.println(~c);//-6 ~ = -(n+1)
			
			int a = 5;
			int b = 3;
			a>>=1;
			//a=a>>1;
			b<<=1;
			//b=b<<1;
			System.out.println(a);//2
			System.out.println(b);//6
			
	}
}