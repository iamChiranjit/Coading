import java.util.Scanner;

public class ReverseTheSentence {
	static String isReverse(String st) {
		char[] ch = st.toCharArray();
		String rs = "";
		for(int i = ch.length-1; i>=0; i--) {
			int k = i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int j = i+1;
			while(j<=k) {
				rs = rs+ch[j];
				j++;
			}
			if(i>=0)
				rs = rs+ch[i];
		}
		return rs;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String x = sc.nextLine();
		System.out.println(isReverse(x));
	}
}
