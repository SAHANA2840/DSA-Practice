public class CircularNeighbours {

	public static void main(String[] args) {
		int n=5;
		int[] arr= {3,1,4,2,5};
		int[] res=new int[n];
		int left,right;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(i==0) {
				left = arr[n-1];
				right = arr[i+1];
			}else if(i==n-1) {
				left = arr[i-1];
				right = arr[0];
			}else {
				left = arr[i-1];
				right = arr[i+1];
			}
			if(left >arr[i]) {
				count++;
			}
			if(right > arr[i]) {
				count++;
			}
			res[i] = count;
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
