public class Dopamine {

	public static void main(String[] args) {
		int n = 5;
		int l = 3;
		int r = 6;
		int[] arr = { 4, 8, 3, 2, 5 };
		int[] max_res = new int[5];
		int max_dp = 0,min_dp=0;
		for (int i = 0; i < arr.length; i++) {
			if ((l <= arr[i]) && (arr[i] <= r)) {
				max_dp ++;
			}
			else {
				max_dp --;
			}
			max_res[i] = max_dp;
		}
		int max=max_res[0];
		int min =max_res[0];
		for(int j=0;j < max_res.length;j++) {
			if(max_res[j] > max) {
				max = max_res[j];
			}else if(max_res[j] < max){
				min = max_res[j];
			}
		}
		System.out.println(max+" "+min);

	}

}
