import java.util.Scanner;
public class SmallestName {
	static String[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		String[] ar = new String[n];
		System.out.println("Enter "+n+ " names");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.next();
		}
		return ar;
	}
	static String lowestName(String[] names) {
		String lname = names[0];
		for(int i = 0; i<names.length; i++) {
			if(names[i].length()<lname.length()) {
				lname = names[i];
			}
		}
		return lname;
	}
	public static void main(String[] args) {
		String[] x = readArray();
		String y = lowestName(x);
		System.out.println(y);
	}
}
