//type casting 
public class Type_casting{
	public static void main (String[] args){
	int a = 65 ;
	char c = (char)a;
	System.out.println(c);//explicit typecasting.
	
	int b = 90;
	double doub = b; //implicit typecasting.
	System.out.println(doub);
	
	float f = 10.1f;
	double d2 = f;
	double d3 = a;
	System.out.println(d2);
	System.out.println(d3);
	
	int i = c;
	System.out.println(i);
	
    float f1 = (float)d2;
	System.out.println(f1);
	
	char c2 = (char)b;
	System.out.println(c2);
	}
}