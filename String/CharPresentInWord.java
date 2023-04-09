import java.util.Scanner;

public class CharPresentInWord {
	static void isCount(String st) {
		char[] ch = st.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			String s = "";
			while(i<ch.length && ch[i]!=' ') {
				s = s + ch[i];
				i++;
			}
			if(s.length()!=0)
				System.out.println(s+" -> "+s.length());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String x = sc.nextLine();
		isCount(x);
	}
}
