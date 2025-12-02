//program to display grade of student
public class Student_grade {
	public static void main (String[] args){
	int marks = 50;
	if (marks >= 85 ){
	System.out.println ("Grade A+ and your marks is : " +marks);
	}
	else if(marks>= 75){
	System.out.println("Grade A and your marks is : " +marks);
	}
	else if(marks>=60){
	System.out.println("Grade B and your marks is : " +marks);
	}
    else if(marks>=35){
	System.out.println("Grade c and your marks is : " +marks);
	}
	else if(marks<35 & marks>0){
	System.out.println("fail and your marks is : " +marks);
	}
	else {
	System.out.println("enter valid number");}
	}
}