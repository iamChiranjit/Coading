import java.util.Scanner;

public class PrintNoUPtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		System.out.println("Reverse Order");
		int x = n;
		while(x>=1) {
			System.out.println(x);
			x--;
		}
	}
}
