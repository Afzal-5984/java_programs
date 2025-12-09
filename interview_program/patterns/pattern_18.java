public class pattern_18{
	public static void main(String[] args){
		int n=4;
			int x=4;
			for (int i=1;i<=n;i++){
			 for (int j=n;j>=i;j--){
				System.out.print(x);
	         }
			 --x;
			System.out.println();
			}
	}
}
//4444
//333
//22
//1