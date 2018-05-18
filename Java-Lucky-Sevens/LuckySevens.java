
public class LuckySevens {

	public static void main(String[] args) {

		int lowerRange = 0;
		int upperRange = 0;

		System.out.println("What is the lower end of the range?");

		lowerRange = IO.readInt();

		System.out.println("What is the upper end of the range?");

		upperRange = IO.readInt();

		if (lowerRange > upperRange) {

			IO.reportBadInput();

			return;

		}

		int sevens = 0;

		for (int count = lowerRange; count <= upperRange; count++) {

			int num = count;

			if (num < 0) {

				num = num * (-1);

				while (num > 0) {

					if (num % 10 == 7) {

						sevens++;
					}

					num = num / 10;
				}

			} else {

				while (num > 0) {

					if (num % 10 == 7) {

						sevens++;
					}

					num = num / 10;
				}
			}
		}
		IO.outputIntAnswer(sevens);

	}// end of main

}// end of class
