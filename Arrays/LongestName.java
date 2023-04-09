import java.util.Scanner;
public class LongestName {
	static String[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		String[] ar = new String[n];
		System.out.println("Enter the names");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.next();
		}
		return ar;
	}
	static String highestName(String[] names) {
		String hname = names[0];
		for (int i = 0; i < names.length; i++) {
			if(names[i].length()>names[0].length())
				hname = names[i];
		}
		return hname;
	}
	public static void main(String[] args) {
		
		String[] x = readArray();
		System.out.println(highestName(x));
	}
}
