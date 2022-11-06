import java.util.*;

class TwentyThree
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int[][] matrix;
		matrix=new int[3][3];
		
		int det=0,det2=0; //=0 mandate
		int x,y,z;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter the element for " + i + "th row and " + j + "th column for 3x3 matrix.");
				matrix[i][j]=scan.nextInt();
			}
		}
		
		//the commented out process is also correct hai for calculating determinant. j sajilo lagcha tei gara, answer same nai aaucha.
		//for(int i=0;i<3;i++){
			//det2 = det + (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3])); //google ko formula which supposedly is wrong because det ko value 0 matra aaucha
			x=(matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]));
			y=(matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]));
			z=(matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]));
			
			det=x-y+z;
		//}
		
		System.out.println("Determinant is " + det);
	}
}