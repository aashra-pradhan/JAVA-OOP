class Imain30
{
	public static void main(String args[])
	{
		Quadratic30 q1=new Quadratic30();
		q1.Input();
		double[] r=q1.Calculate();
		
		for(int i=0;i<r.length;i++){
			System.out.println(" roots are " + r[i]); //x1 and x2 are part of the array so individually access nagarera array lai mstra bolauda huncha.
			
		}
	}
}
	