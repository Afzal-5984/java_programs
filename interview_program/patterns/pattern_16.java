public class pattern_16{
	public static void main(String[] args){
		int n=4;
			
			for (int i=1;i<=n;i++){
			int x=1;
			 for (int j=n;j>=i;j--){
				System.out.print(x++);
	         }
			System.out.println();
			}
	}
}
//1234
//123
//12
//1