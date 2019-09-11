package triangle_sorter;
import java.util.Scanner;
public class TriangleSorterApp {
public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		TriangleSorter whatForm = new TriangleSorter();
		String anotherRun;
		
		do {
			int[] usersSides = askForSides();
		
			System.out.println(whatForm.analyze(usersSides));
			
			System.out.println("");
			System.out.println("Would you like to evaluate 3 new values? \"y\" or \"n\"");
			anotherRun = new Scanner(System.in).nextLine().trim().toLowerCase();
		} while("y".equals(anotherRun));
			
			
	}

	private static int[] askForSides() {
		int[] enteredSides = new int[3];
		System.out.println("Please enter three integer values to evaluate.");
		System.out.println("First length: ");
		enteredSides[0] = userInput.nextInt();
		System.out.println("Second length: ");
		enteredSides[1] = userInput.nextInt();
		System.out.println("Third length: ");
		enteredSides[2] = userInput.nextInt();		
		System.out.println("The values that were entered (" + enteredSides[0] + ", " + enteredSides[1] + ", and " + enteredSides[2] + ")");	
		return enteredSides;
	}

}
