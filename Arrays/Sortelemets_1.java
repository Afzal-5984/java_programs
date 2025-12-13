public class Sortelemets_1{
	public static void main(String[] args){
		int[] arr = {1,0,0,1,0,1,0,1,0};
		int n = arr.length;
		int countzero=0;
		for (int i : arr ){
			if (i==0){
				countzero++;
			}
		}
		for (int i=0 ; i<countzero ; i++){
			arr[i]=0;
		}
		for (int i=countzero ; i<n ; i++){
			arr[i]=1;
		}
		for (int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
//0 0 0 0 0 1 1 1 1