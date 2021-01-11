import java.util.Scanner;

public class PatternPrint {

	public static void printPattern(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int value = scanner.nextInt();
		
		for(int i = value;i>0;i--) {
			for(int j = value;j>i;j--)
				System.out.print(j);
			for(int j = i;j>0;j--)
				System.out.print(i);
			System.out.println();
		}
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		printPattern();
	}

}
