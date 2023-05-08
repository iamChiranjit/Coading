import java.util.Scanner;

public class BinaryToDecimal {
	static int binToDec(int n) {
		int sum = 0, pw = 1;
		do {
			int r = n%10;
			sum = sum+r*pw;
			pw = pw*2;
			n = n/10;
		}while(n!=0);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(binToDec(n));
	}
}
