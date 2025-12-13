public class Nonduplicelem{
	public static void main (String[] args){
		int[] arr ={1,2,1,2,3,5,3};
		int n = arr.length;
		int result = 0;
		for (int i : arr){
			result=result^i;
		}
		System.out.print(result);
	}
}
//5