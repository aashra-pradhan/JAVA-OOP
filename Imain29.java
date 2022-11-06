import java.util.*;

class Imain29
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		ArraySum29 a1=new ArraySum29();
		
		int[] b= new int[10]; //small 'i' in int be careful 
		
		for(int i=0;i<b.length;i++){
			System.out.println("Enter " + i + "th element of array");
			b[i]=scan.nextInt();
		}
		
		int s=a1.Sum(b); //yeta base address matra pathaune ho hai be careful
		System.out.println(" Sum of elements of array is " + s);
	}
}
	
	
