import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Ǻ� ���α׷�");
		System.out.print("���� �Է��ϼ���?(1~12) : ");
		int month = sc.nextInt();
		
		// 1�� ���
		if (month >= 3 && month <= 5 ) {
		System.out.println(month + "���� ���Դϴ�.");
		} else if (month >= 6 && month <=8) {
		System.out.println(month + "���� �����Դϴ�.");
		} else if (month >= 9 && month <=11) {
		System.out.println(month + "���� �����Դϴ�.");
		} else {
		System.out.println(month + "���� �ܿ��Դϴ�.");
		}

	
		// 2�� ���
		if(month==3 || month==4 || month==5) {
		System.out.println(month + "���� ���Դϴ�.");
		} else if (month==6 || month==7 || month==8) {
		System.out.println(month + "���� �����Դϴ�.");
		} else if (month==9 || month==10 || month==11) {
		System.out.println(month + "���� �����Դϴ�.");
		} else {
		System.out.println(month + "���� �ܿ��Դϴ�.");
		}
		sc.close();
		
		// 3�� ���
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:	case 7:	case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:	case 10: case 11:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�ܿ��Դϴ�.");
			break;
		
		}
	}
}