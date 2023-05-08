import java.util.Scanner;
public class FibonacciUptoN {
	static void Pf(int n) {
		int f1 = 0, f2 = 1, f3=0;
		do {
			System.out.println(f1);
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			n--;
		}while(n>0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		Pf(n);
	}
}
