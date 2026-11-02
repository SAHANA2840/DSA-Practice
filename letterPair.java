import java.util.LinkedHashMap;
import java.util.Scanner;

public class letterPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < words.length; i++) {
			String pair = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
			if (map.containsKey(pair)) {
				map.put(pair, map.get(pair) + 1);
			} else {
				map.put(pair, 1);
			}
		}
		int max = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) == max) {
				System.out.print(key);
			}
		}

	}

}
