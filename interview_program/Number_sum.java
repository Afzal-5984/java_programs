//number sum
public class Number_sum{
	public static void main(String[] args){
		int number2 = 123 ;
		int sum = 0;
		while (number2>0){
			int reminder1 = number2 % 10 ;
			sum = reminder1 + sum ;
			number2 = number2/10;
		}
		System.out.println(sum);
		}
	}
