//armstrong number 
public class Armstrong{
public static void main(String[] args){
		int number4 = 153 ;
		int sum = 0;
		int n = number4;
		while (number4>0){
			int reminder4 = number4 % 10;
			sum = sum + (reminder4*reminder4*reminder4);
			number4 = number4 / 10;
		}
		if (sum == n ){
			System.out.println("armstrong number " + n);
		}
		else {
			System.out.println("not armstrong number " + n);
		}
			
	}
	}