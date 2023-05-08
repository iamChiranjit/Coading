import java.util.Scanner;
public class SumOfPrimeNumber {
	static boolean isPrime(int n) {
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int sumOfPrime(int y) {
		int sum = 0;
		for(int i = 2; i<=y; i++) {
			boolean rs = isPrime(i);
			if(rs==true) {
			sum = sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(sumOfPrime(n));
	}
}
