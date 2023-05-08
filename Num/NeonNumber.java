import java.util.Scanner;

public class NeonNumber {
	static int power(int n) {
		int pw = 1, p = 2;
		do {
			pw = pw*n;
			p--;
		}while(p!=0);
		return pw;
	}
	static boolean neon(int n) {
		int sum = 0, dg = power(n), t = n;
		do {
			int r = dg%10;
			sum = sum + r;
			dg = dg/10;
		}while(dg!=0);
		return sum==t;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int x = sc.nextInt();
		System.out.println(neon(x));
	}
}
