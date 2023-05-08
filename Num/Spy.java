import java.util.Scanner;

public class Spy {
	static boolean spy(int n) {
		int sum = 0, p = 1;
		do {
			int r = n%10;
			sum = sum + r;
			p = p*r;
			n = n/10;
		}while(n!=0);
		return sum==p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int x = sc.nextInt();
		System.out.println(spy(x));
	}
}
