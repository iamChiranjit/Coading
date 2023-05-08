import java.util.Scanner;
public class AmstrongNumberWithinN {
	static int digitCount(int n) {
		int count = 0;
		do {
			n = n/10;
			count++;
		}while(n!=0);
		return count;
	}
	static int power(int n, int p) {
		int pw = 1;
		do {
			pw = pw*n;
			p--;
		}while(p>0);
		return pw;
	}
	static boolean isAmstrong(int n) {
		int sum = 0, t=n;
		int dc = digitCount(n);
		do {
			int r = n%10;
			sum = sum + power(r, dc);
			n = n/10;
		}while(n!=0);
		return sum==t;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=a; i++) {
			boolean rs = isAmstrong(i);
			if(rs==true) {
				count++;
				System.out.println(i);
			}
		}
	}
}
