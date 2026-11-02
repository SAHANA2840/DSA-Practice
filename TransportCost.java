import java.util.Scanner;

public class TransportCost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, p, q;
		System.out.println("total no of people");
		n = sc.nextInt();
		System.out.println("ltr of fuels used by a bus");
		p = sc.nextInt();
		System.out.println("ltrs of fuel used by one shuttle");
		q = sc.nextInt();

		int bCost = p * 75;
		int sCost = q * 75;

		int nb = 0;
		int ns = 0;

		nb = n / 80;
		int remB = n % 80;
		if (remB != 0) {
			nb++;
		}
		bCost = nb * bCost;

		ns = n / 8;
		int remS = n % 8;
		if (remS != 0) {
			ns++;
		}
		sCost = ns * sCost;

		int fullBuses = n / 80;
		int mixedShuttles = remB / 8;

		if (remB % 8 != 0) {
			mixedShuttles++;
		}

		int mixedCost = (fullBuses * p + mixedShuttles * q) * 75;

		if (bCost <= sCost && bCost <= mixedCost) {
			System.out.println(bCost);
		} else if (sCost <= bCost && sCost <= mixedCost) {
			System.out.println(sCost);
		} else {
			System.out.println(mixedCost);
		}
	}
}
