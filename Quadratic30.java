/*	q30))Create a Class Quadratic having a, b, c, x1, and x2 as instance variables. Create a function name Input 
(no parameter and no return type) to take the user input for a, b, and c. Then create another function name 
double[ ] Calculate ( ) to calculate two roots and assign to variable x1 and x2 and return these two roots 
must return  to main function. Create another class Imain having main () function to create an object of
 Quadratic class and invoke the function.*/
 
 import java.util.*;
 class Quadratic30
 {
	Scanner scan=new Scanner(System.in);
	int a,b,c; //instance variables
	double x1,x2; //instance variables
	
	void Input(){
		System.out.println("Enter a");
		a=scan.nextInt();
		System.out.println("Enter b");
		b=scan.nextInt();
		System.out.println("Enter c");
		c=scan.nextInt();
	}
	
	double[] Calculate(){ //double type ko array value return garnuparyo return
		double e1= Math.pow((b*b-4*a*c),(1/2)); //arko main class le access nagarnuparne variabler lai function bhitrai define garne, these are private, called static variables and cannot be accessed by other classes whereas the variables that need to be accessed by other classes lai mathi nai define garnuparchas and they are called instance variables.
		x1=(-b + e1)/(2*a);
		x2=(-b - e1 )/(2*a);
		double[] a={x1,x2};
		return a;
	}
}
		

