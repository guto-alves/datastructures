/*
		Coffee machine
  
The new building of the company FZL has 3 floors. At certain times of the year, employees
They drink a lot of coffee. Because of this, the Director decided to present the staff and teachers with
a new espresso machine. This machine should be installed on one of the 3 floors, but the
Installation should be done so that people do not spend much time going up and down
stairs.

Each employee drinks 1 espresso a day. He needs to go from the floor where he works to the floor
where is the machine and return to your workstation. Every employee takes 1 minute to climb
or go down one floor. Since FZL cares a lot about efficiency, it wants to position the
to minimize the total time spent climbing and descending stairs.

Its task is to help management position the machine to minimize the total time spent by
employees going up and down stairs.

Input
The input consists of 3 numbers, A1, A2, A3 (0 <= A1, A1, A2, A3 <= 1000), one per line, where Ai represents the number of people working on the ith floor.

Output
Your program should print a single line containing the total number of minutes to spend.
with the best possible positioning of the machine.

Input Example 1
10
20
30
Exit Example 1
80

Input Example 2
10
30
20
Exit Example 2
60

Input Example 3
30
10
20
Exit Example 3
100
 */

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		scanner.close();

		int time1 = a2 * 2 + a3 * 4;

		int time2 = a1 * 2 + a3 * 2;

		int time3 = a1 * 4 + a2 * 2;

		if (time1 <= time2 && time1 <= time3)
			System.out.print(time1);
		else if (time2 <= time1 && time2 <= time3)
			System.out.print(time2);
		else
			System.out.print(time3);
	}

}
