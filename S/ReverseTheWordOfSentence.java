import java.util.Scanner;

public class ReverseTheWordOfSentence {
	static String isReverse(String st) {
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String x = sc.nextLine();
		System.out.println(isReverse(x));
		sc.close();
	}
}
