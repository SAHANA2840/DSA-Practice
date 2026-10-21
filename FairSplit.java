public class FairSplit {
	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 7, 6 };
		int count = 0;
		int prefix = 0;
		int suffix = 0;
		for (int i = 0; i < arr.length; i++) {
			suffix += arr[i];
		}
		int a = 0;
		while (a < arr.length-1) {
			prefix += arr[a];
			suffix -= arr[a];
			int diff = prefix - suffix;
			int abs_dif= Math.abs(diff);
			if(abs_dif % 2 == 0) {
				count+=1;
			}
 			a++;
		}
		System.out.println(count);
	}
}
