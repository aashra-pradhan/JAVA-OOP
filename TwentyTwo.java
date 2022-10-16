import java.util.*;

class TwentyTwo
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int[][] a;
		a=new int[2][2];
		
		int sum=0; //=0 garnai parcha natra initialization bhayechaina bhanera error dekhayo tara be careful hai with kata 0 garne, like loop bhitra chai nagara
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("Enter the element of " + i + "th row and " + j + "th column of 2x2 matrix for addition");
				a[i][j]=scan.nextInt();
				sum = sum + a[i][j];
			}
		}
		
		System.out.println("The sum of the elements is " + sum);
	}
}