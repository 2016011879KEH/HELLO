package helloworld;

public class MultiTableChecker {

	public static void main(String[] args) {
		
		for ( int i = 2 ; i < 10; i= i+1 ) {
			for (int j = 1 ; j < 10; j++) {
				if(j==5) {
					System.out.print("\t");
					break;
				}
				System.out.print( i + "*" + j + "=" + (i*j)+"\t");
			}
			System.out.println();
			
		}
		
	}

}
