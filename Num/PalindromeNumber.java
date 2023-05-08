import java.util.Scanner;
public class PalindromeNumber {
	static boolean isPalindrome(int n) {
		int sum = 0, t=n;
		do {
			int r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}while (n!=0);
		return sum==t;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		boolean rs = isPalindrome(n);
		System.out.println(isPalindrome(n));
		}
}
