import java.util.*;

class Nine{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if((a<b)&&(a<c)){
			System.out.println("The lowest number is"+a);
		}
		else if((b<a)&&(b<c)){
			System.out.println("The lowest number is"+b);
		}
		else{
			System.out.println("The lowest number is"+c);
		}
		
	}
}