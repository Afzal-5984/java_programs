//reverse number 
public class Reverse{
	public static void main(String[] args){
		int number5 = 123 ;
		int sum = 0;
		while (number5>0){
			int reminder5 = number5 % 10;
			sum = (10 * sum + reminder5);
			number5= number5 / 10;
		}
	    System.out.println(sum);	

	}
	}