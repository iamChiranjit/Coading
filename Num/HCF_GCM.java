import java.util.Scanner;
public class HCF_GCM {
	static int Gcf(int a, int b) {
		int hcf = 1;
		for(int i = 1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0)
				hcf=i;
		}
		return hcf;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(Gcf(x, y));
    }
}
