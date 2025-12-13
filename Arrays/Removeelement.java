public class Removeelement{
	public static void main(String[] args){
		int[] arr ={7,8,9,1,2,3};
		int position = 2;
		int n =arr.length;
		for (int i = position ; i<n-1;i++){
			arr[i]= arr[i+1];}
		arr[n-1]=0;
		for (int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
//7 8 1 2 3 0