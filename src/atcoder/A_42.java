package atcoder;

public class A_42 {
	public static void main(String[] args) {
		int A = new java.util.Scanner(System.in).nextInt();
		int B = new java.util.Scanner(System.in).nextInt();
		int C = new java.util.Scanner(System.in).nextInt();

		int[] array = { A, B, C };
		
		if (A*B*C==175) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		/*
		 * 配列の順まで同じ場合 
		 * int[] ans = { 5, 7, 5 }; 
		 * if (Arrays.equals(array, ans)) {
		 * System.out.println("yes"); } 
		 * else { System.out.println("no"); }
		 */
	}
}
