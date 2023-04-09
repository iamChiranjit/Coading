import java.util.Scanner;
public class toLowerCase {
	static String toLower() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i] = (char) (ch[i]+32);
			}
		}
		st = new String(ch);
		return st;
	}
	public static void main(String[] args) {
		System.out.println(toLower());
	}
}
