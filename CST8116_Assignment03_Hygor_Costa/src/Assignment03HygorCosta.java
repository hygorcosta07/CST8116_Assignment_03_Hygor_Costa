
public class Assignment03HygorCosta {

	public static void main(String[] args) {

		// Declarations and initializing them and declaring the length of the Array
		int roll = 0;
		int[] diceRolls = new int[20];
		int totalRolls = 0;

		// Rules for Randometer and maximum and minimum parameters for it.
		for (int count = 0; count < 1000; count++) {
			roll = (int) (Math.random() * 20) + 1;
			diceRolls[roll] = diceRolls[roll - 1] + 1;
		}

		// Report creation configuration.
		for (int index = 0; index < diceRolls.length; index++) {
			System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			totalRolls = totalRolls + diceRolls[index];
		}
		// output
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Hygor Costa");

	}

}
