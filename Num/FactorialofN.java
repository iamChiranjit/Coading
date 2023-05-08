import java.util.Scanner;
public class FactorialofN {
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Number");
//	int n = sc.nextInt();
//	int fact = 1, i = 1;
//	while(i<=n) {
//		fact = fact*i;
//		i++;
//		System.out.println(fact);
//	}
//	}
	static int factDetails(int n) {   //// We can Call a method multiple number of time
		int fact = 1;
		while (n>0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		int x = factDetails(5);
		System.out.println(x);
	}
}
