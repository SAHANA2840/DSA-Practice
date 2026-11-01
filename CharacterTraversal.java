import java.util.Scanner;

public class characterTaversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int count=0;
		for (char s : arr) {
			int ind = str.indexOf(s) + 1;
			int i = 0;
			while (i < ind) {
				System.out.print(s);
				i++;
			}
			if (count != str.length()-1 ) {
				System.out.print("-");
			} else {
				System.out.print("");
			}
			count++;
		}
	}
}
