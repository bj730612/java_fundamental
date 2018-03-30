import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홀수 짝수 판별프로그램");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		if (n % 2 != 1) {
		System.out.println(n + "은(는) 짝수 입니다.");
		} else {
		System.out.println(n + "은(는) 홀수 입니다.");
		}
		sc.close();
	}
}
