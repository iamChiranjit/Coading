import java.util.Scanner;
public class FibonacciWithinN {
	static void Pf(int n) {
		int f1 = 0, f2 = 1, f3 = 0;   // 0 1 1 2 3 5 8 13
		do {
			System.out.println(f1);
			f3 = f1+f2;  // 1 2 3
			f1 = f2;     // 1 1 2
			f2 = f3;     // 1 2 3
		}while(f1<=n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		Pf(a);
	}
}
