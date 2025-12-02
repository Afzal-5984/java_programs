//number product

public class Number_product{
	public static void main(String[] args){
		int number3 = 123,product = 1;
		while (number3>0){
			int reminder2 = number3%10;
			if (reminder2!=0){
			product = product * reminder2;}
			number3 = number3/10;
		}
		System.out.println(product);
	} 
	}