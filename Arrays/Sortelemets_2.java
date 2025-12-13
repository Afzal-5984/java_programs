public class Sortelemets_2{
	public static void main(String[] args){
		int[] arr = {0,2,1,0,1,2,1,0,2,1};
		int n = arr.length;
		int countzero=0;
		int countone=0;
		for (int i : arr){
			if (i==0){
				countzero++;
			}
			else if (i==1){
				countone++;
			}
		}
		for (int i = 0 ; i<countzero;i++){
			arr[i] = 0;
		}
		for (int i = countzero; i< countone+countzero;i++){
			arr[i]=1;
		}
		for (int i = countone+countzero ; i<n ; i++){
			arr[i]=2; 
		}
		for (int i =0 ;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
//0 0 0 1 1 1 1 2 2 2