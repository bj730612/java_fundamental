import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력받은 숫자 거꾸로 출력하는 프로그램");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

		while (n > 0) {
			System.out.print(n % 10);
			n /= 10;
		}

		sc.close();
	}

}
