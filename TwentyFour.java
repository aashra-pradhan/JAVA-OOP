import java.util.*;

class TwentyFour
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int[][] a;
		a=new int[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter the element for " + i + "th row and " + j + "th column for 3x3 matrix.");
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){
			
			for(int j=i;j<3;j++){
				
				if(i>j){
					System.out.print("\t");

				}
				else{
					System.out.print(a[i][j]);
				}

			}
			
			System.out.println("");//eta ln narakhi () matra rakhe sabai kura eutai line ma aaucha, ki ln use nagarne bhaye ("\n") esari rakhnuparyo for new line

		}
	}
}
