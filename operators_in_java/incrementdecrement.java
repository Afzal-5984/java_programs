//increment & decrement opertors:
//(a++,a--,++a,--a)	
public class Incrementdecrement {
	public static void main (String[] args){
		int a = 5 ;
			System.out.println(a++);//5
			System.out.println(a);//6
			System.out.println(++a);//7
			System.out.println(a--);//7
			System.out.println(a);//6
			System.out.println(--a);//5
			afzal();//calling child class in main class.
	}
	public static void afzal (){
			int c = 19;
			int d = c++ + --c + c-- + ++c + --c + c++;
			System.out.println(d);//112
	}
}
