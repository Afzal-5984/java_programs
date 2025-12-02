//prime number 

public class Prime_num{
	public static void main(String[] args){
		int n2= 10 ;
		boolean isprime = true ;
		for (int i =2 ; i<=n2/2 ; i++){
			if ( n2 % i == 0){
				isprime = false ;
				break;
			}
		}
		if (isprime){
			System.out.println("prime no :" +n2);
		}
		else {
			System.out.println("not a prime : "+n2);
		}
	
	}
}