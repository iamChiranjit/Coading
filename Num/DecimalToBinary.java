import java.util.Scanner;

public class DecimalToBinary {
	static String decToBin(int n) {
		String s = "";
		do {
			int r = n%2;
			s = r+s;
			n = n/2;
		}while(n!=0);
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal number: ");
		int n = sc.nextInt();
		System.out.println(decToBin(n));
	}
}
