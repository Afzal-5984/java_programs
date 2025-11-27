//Logical Operators:-
//(&&,||,!)
public class Logical {
	public static void main (String[] args) {
		int a = 12 ;
		int b = 13;	
		System.out.println(a>b&&a<b);//false
		System.out.println(a>b||a<b);//true
		System.out.println(!(a>b&&a<b));//true
		int c = 5 ;
		int d = 3 ;
		boolean answerofANDcondition = c >=5 && d>=3 ;
			System.out.println(answerofANDcondition);//true
		boolean answerofORcondition = c >5 || d>3 ;
			System.out.println(answerofORcondition);//false
		
			System.out.println(!answerofORcondition);//true	
	}
}