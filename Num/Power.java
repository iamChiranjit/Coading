
public class Power {
	static int power(int n, int p) {
		int pro = 1;
		while(p>0) {
			pro = pro*n;
			p--;
		}
		return pro;
	}
	public static void main(String[] args) {
		int x = power(3,2);
		System.out.println(x);
	}
}
