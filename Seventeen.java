class Seventeen{
	public static void main(String args[]){
		for(int i=20;i<=100;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			
			if(count==2){
			System.out.println(i + "\t"); //formatting yaad gara hai + operator kata halne, spacingsand all values halna no need of conversion characters and stuff
			}
		}
	}
}
		
		