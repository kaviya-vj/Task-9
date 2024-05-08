package task;

public class DiamondPattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			if (i == 0 || i == 4) {
				System.out.println("* *");
			} else {
				System.out.println(i == 2 ? "*" : "**");
			}

		}
	}
}