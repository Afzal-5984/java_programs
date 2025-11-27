public class Incrdecr{
	public static void main(String[] args){
	int a = 19;
	int c = (a++ + --a + a-- + ++a + --a + a++);
		System.out.println(c);
	}
}