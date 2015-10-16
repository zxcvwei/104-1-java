import java.util.Scanner;

public class car_bill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int minute = scn.nextInt();
		int x = minute / 30;
		int y = minute % 30;
		int end = 0;
		if (x < 4 && y > 0) {
			end = (x + 1) * 30;
		}
		System.out.print(end);
	}

}
