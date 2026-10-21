public class SubarraySumTriplets
public static void main(String[] args) {
	int[] arr = {1,2,1,3,5,2,4,2};
	int res = 0;
	int[] dup = new int[3];
 	for(int i = 0;i<arr.length-2;i++) {
 		int a=0;
		for(int j =i;j<i+3;j++) {
			dup[a]=arr[j];
			a++;
		}
		if(dup[0] + dup[2] == dup[1]) {
			res ++;
		}
	}
	System.out.println(res);
}
}
