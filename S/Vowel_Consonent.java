import java.util.Scanner;

public class Vowel_Consonent {
	static void readArray(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		int v=0, c=0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='A'&& ch<='Z') {
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					v++;
				else
					c++;
			}
			if(ch>='a'&& ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					v++;
				else
					c++;
			}
		}
		System.out.println("Vowel= "+v);
		System.out.println("Consonent= "+c);
	}
	
	
	public static void main(String[] args) {
		readArray();
	}
}
