import java.util.Scanner;

public class WordPresentInSentence {
	static int count(String st) {
		char[] ch = st.toCharArray();
		int count = 0;
		for(int i = 0; i<ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String x = sc.nextLine();
		System.out.println("Word present in Sentences: "+count(x));
	}
}
