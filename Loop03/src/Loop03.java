import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

		// 3-1번

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 3-2번
		
/*		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/

		// 4-1번

/*		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		// 4-2번

/*		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		
		sc.close();

	}

}
