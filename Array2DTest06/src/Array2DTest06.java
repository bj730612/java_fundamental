import java.util.Scanner;

public class Array2DTest06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][5];
		String retry = null;
		
		System.out.println("��� �׽�Ʈ ���α׷�");
		do {
			System.out.print("����� ��(1~45) : ");
			int n = sc.nextInt();
			int count = 0;
			
/*			// 2���� �迭�� ������ �����ؼ� ����
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = (int) (Math.random() * 45) + 1;
				}
			}
			
			// 2���� �迭�� ���� ���
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(n == a[i][j]) {
						System.out.printf("%5d", a[i][j]);
					}
				System.out.println();
			}
			
			// ����� ���� 2���� �迭�� ��(����)�� ��
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (n == a[i][j]) {
						++count;
					}
				}
			}*/
			
			for (int i = 0; i < a. length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = (int) (Math.random() * 45) + 1;
					if (n == a[i][j]) {
						++count;
						System.out.printf(" *%2d*", a[i][j]);
					} else {
						System.out.printf("%5d", a[i][j]);
					}
				}
				System.out.println();
			}
			switch (count) {
			case 0:
				System.out.println("���� ���Դϴ�.");
				break;
			case 1:
				System.out.println("������ ���Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� ���Դϴ�.");
				break;
			case 3:
				System.out.println("��� ������ ���Դϴ�.");
				break;
			case 4:
				System.out.println("����� ���Դϴ�.");
				break;
			default:
				System.out.println("��Ʈ�� ¯ ����� ���Դϴ�.");
				break;
			}
			System.out.println("���߽� ������ " + count + "�� �Դϴ�.");
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�?(Y/N) : ");
			retry = sc.next();
		} while(retry.equalsIgnoreCase("y"));
		
		sc. close();
		
	}

}
