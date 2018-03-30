import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int b = sc.nextInt();
		System.out.print("정수 입력 3 : ");
		int c = sc.nextInt();

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		sc.close();
	}
}
