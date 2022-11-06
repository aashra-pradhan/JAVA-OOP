import java.util.*;

class Imain27
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		Rectangle27 r1=new Rectangle27(); //1st object (every obj is an example of the class rectangle27, this is called instantiation.
		
		System.out.println("Enter l and b for first rectangle");
		r1.l=scan.nextInt(); //access garne tarika hera
		r1.b=scan.nextInt();
		r1.computeArea();
		
		Rectangle27 r2=new Rectangle27(); //2nd object
		
		System.out.println("Enter l and b for second rectangle");
		r2.l=scan.nextInt(); //access garne tarika hera
		r2.b=scan.nextInt();
		r2.computeArea();
		
		if(r1.area>r2.area){
			r1.displayArea();
		}
		else{
			r2.displayArea();
		}
		
	}
}
		
		



		