import java.util.Scanner;

/**
 * 
 * @author Mathan-Jeevika
 *
 */

public class PatternPrint {

	/**
	 * Method to print the following pattern
	 *  
	 *  this for value = 3
	 *  
	 *  333
	 *  322
	 *  321
	 */
	
	public static void printPattern(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");

		//getting the value from the user
		
		int value = scanner.nextInt();
		
		for(int i = value;i>0;i--) {
			//to print the values other that 
			for(int j = value;j>i;j--)
				System.out.print(j+" ");
			
			//to print the row value which is same
			for(int j = i;j>0;j--)
				System.out.print(i+" ");
			
			System.out.println();
		}
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		printPattern();
	}

}
