import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ȧ�� ¦�� �Ǻ����α׷�");
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		if (n % 2 != 1) {
		System.out.println(n + "��(��) ¦�� �Դϴ�.");
		} else {
		System.out.println(n + "��(��) Ȧ�� �Դϴ�.");
		}
		sc.close();
	}
}
