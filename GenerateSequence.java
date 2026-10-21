public class GenerateSequence {

	public static void main(String[] args) {
		int n=8;
		int[] arr = {1, 1, 2, 3, 5, 8};
		int[] res= new int[n];
		for(int i=0;i<arr.length;i++) {
			res[i] = arr[i];
		}
		int a = arr.length;
		while(a < n) {
			res[a] = res[a-1] +res[a-2];
			a++;
		}
		for(int j=0;j<res.length;j++) {
			System.out.println(res[j]);
		}
	}

}
