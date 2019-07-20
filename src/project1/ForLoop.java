package project1;

public class ForLoop {

	public static void main(String[] args) {
		
		
/*		int number=10;
		int fact=0;
		
	for(int i=1; i<=number; i++) {
		
		fact = (fact+i);
	
	}
	System.out.println(fact/number);*/

	
	
	
	
	
	//Printing 1,12,123,1234,....
	
	
	int numberr=6;
	int i,j;
	
	for( i=1; i<=numberr; i++) {
		
		for(j=1;j<=i;j++) {
			
		System.out.print(j);	
			
		}
		System.out.println("");
		
	}


}
}