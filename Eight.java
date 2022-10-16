import java.util.*;

class Eight{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		if(a>b){
			System.out.println(a + " is greatest number");
		}
		else{
			System.out.println(b + "is greatest number");
		}
	}
}