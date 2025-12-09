public class pattern_19{
	public static void main(String[] args){
		int n=4;
			for (int i=1;i<=n;i++){
			char ch = (char)('E'- i);
			 for (int j=n;j>=i;j--){
				System.out.print(ch);
	         }
			System.out.println();
			}
	}
}
//DDDD
//CCC
//BB
//A