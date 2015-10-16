public class one_add_to_hundred {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[100];
		int end = 0;
		for (int i = 0; i < 100; i++) {
			a[i] = i + 1;
			end = end + a[i];
		}
		System.out.print(end);
	}

}
