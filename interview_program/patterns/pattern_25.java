//   2
//  242
// 24642
//2468642

public class pattern_25{
	public static void main(String[] args){
		int n=4;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++){
				
				System.out.print(j*2);
			}
			for (int j=i-1;j>0;j--){
				System.out.print(j*2);
			}
		System.out.println();
		}
	pattern_02();
	}
	public static void pattern_02(){
		int n=4;
		for (int i=1;i<=n;i++){
			if (i==n){
				continue ;
			}
			for (int j=0;j<i-1;j++){
				System.out.print(" ");
			}
			for (int j=0;j<=n-i;j++){
				System.out.print("*");
				
			}
			for (int j=n-i;j>0;j--){
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i=1;i<=n;i++){
			for (int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=2*(i-1)+1;j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}