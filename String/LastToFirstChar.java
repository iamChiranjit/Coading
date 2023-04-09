import java.util.Scanner;

public class LastToFirstChar {
	static String LTFCS(String st) {
		char[] ch = st.toCharArray();
		int t = 0;
		for(int i = 0; i<ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
				t=i;
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
				char temp = ch[i];
				ch[i] = ch[t];
				ch[t] = temp;
			}
		}
		st = new String(ch);
		return st;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String x = sc.nextLine();
		System.out.println(LTFCS(x));
	}
}
