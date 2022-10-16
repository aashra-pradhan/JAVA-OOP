import java.util.*;

class Ten{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		double m1,m2,m3,m4,m5;
		double per,div;
		
		System.out.println("Enter the marks in 5 subjects:");
		m1=scan.nextDouble();
		m2=scan.nextDouble();
		m3=scan.nextDouble();
		m4=scan.nextDouble();
		m5=scan.nextDouble();
		
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35){
			per=(m1+m2+m3+m4+m5)/5.0;
				if(per>=80.0 && per<=100.0){
					System.out.println("Distinction with " + per + "%");
				}
				else if(per>=70.0 && per<80.0){
					System.out.println("First division with " + per +"%");
				}
				else if(per>=60.0 && per<70.0){
					System.out.println("Second division with " + per +"%");
				}
				else if(per>=40.0 && per<60.0){
					System.out.println("Third division with " + per +"%");
				}
				else{
					System.out.println("Ungraded with " + per +"%");
				}
		}
		else{
		
			System.out.println("You've failed at least in one subject so will not display the percentage and the division");
		}
	}
}