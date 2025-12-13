public class Prodofelements{
	public static void main(String[] args){
		int[] arr={1,2,0,4,5};
		int product = 1;
		for (int i : arr){
			if (i!=0){
			product = product*i;}
		}
		System.out.print(product);
	}
}
//40