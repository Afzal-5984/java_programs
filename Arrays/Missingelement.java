public class Missingelement{
	public static void main(String[] args){
		int[] arr = {1,2,4,5,0};
		int sum1=0;
		int n = arr.length;
		for (int i=1;i<=n;i++){
			sum1=sum1+i;
		}
		int sum2=0;
		for (int i : arr){
			sum2 =sum2+i;
		}
		System.out.println(sum1-sum2);
		
		way2();
	}
//3
	
	public static void way2(){
		int[] arr = {1,2,4,5,0};
		int n=arr.length;
		int sum1=n*(n+1)/2;
		for (int i : arr ){
			sum1 = sum1-i;
		}
		System.out.print(sum1);
	}
}
//3