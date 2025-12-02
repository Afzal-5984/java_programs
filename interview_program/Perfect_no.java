//program for perfect number 

public class Perfect_no{
	public static void main(String[] args) {
		int n1=28,sum=0;
		for (int i =1 ; i<=n1/2 ; i++){
			if (n1%i == 0){
				sum = sum + i;
			}
		}
		
		if (sum == n1 ){
			System.out.println("perfect no :" +n1);
		}
		else {
			System.out.println("not a perfect no :" +n1);
	    }
   } 
   }