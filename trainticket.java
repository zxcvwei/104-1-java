public class trainticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin = 137;
		int n = coin / 10;// = 13...7
		int m = (coin % 10) / 5;// = 1...2
		int p = ((coin % 10) % 5) / 1;// = 2...0
		System.out.println(n);
		System.out.println(m);
		System.out.println(p);
	}

}
