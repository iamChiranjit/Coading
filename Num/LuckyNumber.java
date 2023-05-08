
public class LuckyNumber {
	static boolean lucky(int n) {
		while(n>9) {
			int sum = 0;
			do {
				int r = n%10;
				sum = sum+r;
				n=n/10;
			}while(n!=0);
			n = sum;
		}
		return n==9;
	}
	public static void main(String[] args) {
		boolean x = lucky(144);
		System.out.println(x);
	}
}
