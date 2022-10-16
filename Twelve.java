import java.util.*;

class Twelve{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Enter any number from 1 to 7:");
		a=scan.nextInt();
		
		switch(a){
			case 1:
				System.out.println("Sunday");
				break;
				
			case 2:
				System.out.println("Monday");
				break;
				
			case 3:
				System.out.println("Tuesday");
				break;
			
			case 4:
				System.out.println("Wednesday");
				break;
				
			case 5:
				System.out.println("Thursday");
				break;
				
			case 6:
				System.out.println("Friday");
				break;
				
			case 7:
				System.out.println("Saturday");
				break;
				
			default:
				System.out.println("The number isn't between 1 to 7");
				break;
		}
	}
}