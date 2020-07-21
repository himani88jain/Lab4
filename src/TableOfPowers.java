import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("Enter an integar:");
			int num = scnr.nextInt();
	/*Checking the sqaures and cubes of the numbers*/	
			
			System.out.println("Number		Squared		Cubed");
			System.out.println("=======		=======		=======");
			for (int i = 1; i <= num; i++) {
				System.out.println(i + "		" + i * i + "		" + i * i * i);
			}
			
			
	/*Making multiplcation table*/		
			
			for (int i = 1; i <= num; i++)
				System.out.print(" " + i + " ");
			System.out.println();
			for (int i = 1; i <= num; i++)
				System.out.print(" = ");
			System.out.println();
			for (int i = 1; i <= num; i++) {
				System.out.print(i + "|");
				for (int j = i; j <= num * i; j += i) {
					System.out.print(j + "  ");
				}
				System.out.println();
			}
			System.out.println("\nWould you like to continue(y/n)");
			b = scnr.next().equalsIgnoreCase("y");
		}
		scnr.close();
	}

}
