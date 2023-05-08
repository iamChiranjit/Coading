
public class StrongNumber {
	static int getFact(int x) {
		int prod = 1;
		while(x>1) {
			prod = prod*x;
			x--;
		}
		return prod;
	}
	static boolean isStrong(int n) {
		int sum = 0, t=n;
		do {
			int r = n%10;
			sum = sum + getFact(r);
			n = n/10;
		}while(n!=0);
		return t==sum;
	}
	public static void main(String[] args) {
		boolean b = isStrong(145);
		System.out.println(b);
	}
}
