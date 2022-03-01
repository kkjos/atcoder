package atcoder;

public class A_44 {
	public static void main(String[] args) {
		int N = new java.util.Scanner(System.in).nextInt();
		int K = new java.util.Scanner(System.in).nextInt();
		int X = new java.util.Scanner(System.in).nextInt();
		int Y = new java.util.Scanner(System.in).nextInt();

		if (N < K) {
			System.out.println(N * Y);
		} else {
			System.out.println(K * X + Y * (N - K));
			;
		}
	}
}
