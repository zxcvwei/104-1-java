import java.util.Scanner;

public class square_ij {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入兩個整數");
		int i = scn.nextInt();
		int j = scn.nextInt();
		int k = i + j;
		System.out.print(k * k);
	}

}
