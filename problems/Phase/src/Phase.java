
/*
				Phase

In several academic competitions, such as the Brazilian Computer Olympics (OBI), a certain
number of competitors qualifies from one phase to the next, guaranteeing one of the vacancies
available. However, this amount is usually variable, since given a certain amount
If there is a minimum of qualifying, there is often a tie in the last qualifying wave. In this case,
It is common for all competitors tied for last place to qualify.

Your task is to help calculate the number of competitors ranked for the next phase. You
will receive a list of scores obtained by competitors and the minimum number of seats for the stage
next and you must decide how many competitors will actually qualify.

Input

The first line of the entry contains an integer N, 1 <= N <= 1000, representing the number
from competitors. The second line will contain an integer K, 1 <= K <= N, indicating the minimum number of
competitors who must qualify for the next phase. Then N lines will each contain
a number between 1 and 1000 inclusive, corresponding to a competitor's score.

Output

Your program should print a line containing the number of classifieds for the next phase.

Input Example 1
10
3
1
2
3
4
5th
5th
4
3
2
1
Exit Example 1
4

Input Example 2
5th
2
500
500
500
500
500
Exit Example 2
5th

 */

import java.util.Arrays;
import java.util.Scanner;

public class Phase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfCompetitors;
		do {
			System.out.print("Enter the number of competitors: ");
			numberOfCompetitors = scanner.nextInt();

			if (numberOfCompetitors < 1 || numberOfCompetitors > 1000)
				System.out.println("Number of competitors invalid. Try again!");

		} while (numberOfCompetitors < 1 || numberOfCompetitors > 1000);

		int minimumOfCompetitorsToQualify;
		do {
			System.out.print("Enter the minimum number of competitors to qualify: ");
			minimumOfCompetitorsToQualify = scanner.nextInt();

			if (minimumOfCompetitorsToQualify < 1 || minimumOfCompetitorsToQualify > numberOfCompetitors)
				System.out.println("Minimum number of competitors to qualify invalid. Try again!");

		} while (minimumOfCompetitorsToQualify < 1 || minimumOfCompetitorsToQualify > numberOfCompetitors);

		int[] punctuations = new int[numberOfCompetitors];

		System.out.println("Enter the punctuations: ");
		for (int i = 0; i < numberOfCompetitors;) {
			punctuations[i] = scanner.nextInt();
			if (punctuations[i] < 1 || punctuations[i] > 1000) {
				System.out.println("Punctuations must be between 1 and 1000 inclusive. Try again!");
				continue;
			}

			i++;
		}

		scanner.close();

		displayTotalClassfieds(numberOfCompetitors, minimumOfCompetitorsToQualify, punctuations);
	}

	public static void displayTotalClassfieds(int numberOfCompetitors, int minimumOfCompetitorsToQualify,
			int[] punctuations) {
		Arrays.parallelSort(punctuations);

		int totalClassified = 0;

		int currentPontuation = punctuations[numberOfCompetitors - 1];
		totalClassified++;

		for (int i = numberOfCompetitors - 2; i >= 0; i--) {
			if (punctuations[i] == currentPontuation) {
				totalClassified++;
			} else {
				if (totalClassified >= minimumOfCompetitorsToQualify)
					break;
				else {
					totalClassified++;
					currentPontuation = punctuations[i];
				}
			}

		}

		System.out.printf("Total classifieds = %d", totalClassified);
	}

}
