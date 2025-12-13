public class Matchelement {
		public static void main (String[] args){
			int[] arr = {7,8,9,1,2,3};
			int key=3;
			int n = arr.length;
			for (int i=0 ;i<n ;i++){
				if (arr[i]==key){
					System.out.print("matched with : "+ key);
					return;
				}
			}
			System.out.print("not have matching key");
		}
}
//matched with : 3