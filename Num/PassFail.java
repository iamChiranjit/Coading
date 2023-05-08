import java.util.Scanner;
public class PassFail {
	static String subMarks(int p, int c, int m, int b) {
		double per = (p+c+m+b)/4;
		return (p<35 || c<35 || m<35 || b<35)? "Fail": (per>=75)? "Distinction": (per>=60)? "First Class":(per>=40)? "Second Class": "Pass";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(subMarks(a,b,c,d));
	}
}
