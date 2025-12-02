//number print 
public class Number_print{
	public static void main(String[] args){
		int number1 = 123;
		while (number1>0){
			int reminder = number1 % 10 ;
			System.out.println(reminder);
			number1 = number1 / 10;
		}
	}
}