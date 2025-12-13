public class Addelemet{
	public static void main (String[] args){
		int[] arr = {1,2,3,4,0};
		int element=10;
		int position =0;
		int n=arr.length;
		for (int i =n-1 ;i>position;i--){
			arr[i]=arr[i-1];
		}
		arr [position]=element;
	    for (int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
//10 1 2 3 4