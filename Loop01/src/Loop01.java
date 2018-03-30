import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정사각형 만드는 프로그램");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		

		int i, j;
		
		// for
		
/*		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/

		// while

/*		i = 1;
		while (i <= n) {
			j = 1;
			while (j <= n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}*/

		// do while

		i = 1;
		do {
			j = 1;
			do {
				System.out.print("* ");
				j++;
			} while (j <= n);
			System.out.println();
			i++;
		} while (i <= n);

		sc.close();
		
	}

}
