import java.util.Scanner;
public class ProductOfDigit {
	static int digitProd(int n) {
		int prod = 1;
		do {
		int r = n%10;
		prod = prod*r;
		n = n/10;
		}while(n!=0);
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The product of Digit: " + digitProd(n));
	}
}
