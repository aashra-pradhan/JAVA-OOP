import java.util.*;
class Seven
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value for a");
		double a=sc.nextDouble();
		System.out.println("enter value for b");

		double b=sc.nextDouble();
		System.out.println("enter value for c");

		double c=sc.nextDouble();
		double d= Math.pow(b,2)-4*a*c;

		if(d>0.0){
			
			double r1 = ((-b + Math.pow(d, 0.5)) / (2.0 * a));  
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
			System.out.println("The roots are " + r1 + " and " + r2);  
		
		}  
		else if (d == 0.0)  {  
			
			double r1 = -b / (2.0 * a);  
			System.out.println("The root is " + r1);  
		
		}  
		else{  
			
			System.out.println("Roots are not real.");  
		
		}  
	}
	
}
