import java.util.*;

class TwentyThree
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int[][] a;
		a=new int[3][3];
		
		int det=0; //=0 mandate
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter the element for " + i + "th row and " + j + "th column for 3x3 matrix.");
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){
			det = det + (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3])); //google ko formula which supposedly is wrong because det ko value 0 matra aaucha

		}
		
		System.out.println("Determinant is " + det);
	}
}