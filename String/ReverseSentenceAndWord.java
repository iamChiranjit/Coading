import java.util.Scanner;

public class ReverseSentenceAndWord {
	static String wReverse(String st) {
		char[] ch = st.toCharArray();
		String s = "";
		for(int i = 0; i<ch.length; i++) {
			int k = i;
			while(i<ch.length && ch[i]!=' ') {
				i++;
			}
			int j = i-1;
			while(j>=k) {
				s = s+ch[j];
				j--;
			}
			if(i<ch.length)
				s = s+ch[i];
		}
		return s;
	}
	static String sReverse(String st) {
		char[] ch = st.toCharArray();
		String s = "";
		for(int i = ch.length-1; i>=0; i--) {
			int k = i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int j = i+1;
			while(j<=k) {
				s = s+ch[j];
				j++;
			}
			if(i>=0)
				s = s+ch[i];
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Write a Sentence: ");
		String x = sc.nextLine();
		System.out.println(sReverse(wReverse(x)));
	}
}
