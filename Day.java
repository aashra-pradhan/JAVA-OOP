import java.util.*;

class Day{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Enter any number from 1 to 7:");
		a=scan.nextInt();
		
		switch(a){
		Case 1:
			System.out.println("Sunday");
			break;
			
		Case 2:
			System.out.println("Monday");
			break;
			
		Case 2:
			System.out.println("Tuesday");
			break;
		
		Case 2:
			System.out.println("Wednesday");
			break;
			
		Case 2:
			System.out.println("Thursday");
			break;
			
		Case 2:
			System.out.println("Friday");
			break;
			
		Case 2:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("The number isn't between 1 to 7");
			break;
		}
	}
}