package atcoder;

public class A_43 {
	public static void main(String[] args) {
		int child = new java.util.Scanner(System.in).nextInt();

		int candy = 0;
		for (int i = 0; i <= child; i++) {
			candy += i;
		}
		System.out.println("必要な飴の数は" + candy + "個");
	}
}
