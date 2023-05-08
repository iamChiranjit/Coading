import java.util.Scanner;
public class SmallestAmong3 {
	static int isSmallest(int a, int b, int c) {
//		if(a<b && a<c) {
//			return a;
//		}
//		else if(b<c) {
//			return b;
//		}
//		else {
//			return c;
//		}
		return (a<b && a<c)? a: (b<c)? b: c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(isSmallest(a, b, c));
	}
}
