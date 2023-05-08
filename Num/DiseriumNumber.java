import java.util.Scanner;
public class DiseriumNumber {
	static int countDigit(int n) {
		int count = 0;
		do {
			n=n/10;
			count++;
		}while(n!=0);
			return count;
	}
	static int power(int n, int p) {
		int pw = 1;
		do {
			pw = pw*n;
			p--;
		}while(p!=0);
			return pw;
	}
	static boolean diseriumNumber(int n) {
		int sum = 0, t=n;
		int dc = countDigit(n);
		do {
			int r = n%10;
			sum = sum + power(r, dc);
			n = n/10;
			dc--;
		}while(n!=0);
		return t==sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean b = diseriumNumber(a);
		System.out.println(b);
	}
}
