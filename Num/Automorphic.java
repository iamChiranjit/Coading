import java.util.Scanner;

public class Automorphic {
	static boolean isAutomorphic(int n) {
		int t = 10, pw = n*n, temp = n;
		do {
			int r = pw%t;
			if(temp == r) {
				return true;
			}
			n = n/10;  // this statement is only for limitation purpose
			t = t*10;
		}while(n!=0);
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(isAutomorphic(n));
	}
}
