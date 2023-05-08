import java.util.Scanner;
public class LCM {
	static int Lcm(int a, int b) {
		int lcm = (a>b)? a: b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				break;
			}
			lcm++;
		}
		return lcm;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(Lcm(x, y));
	}
}
