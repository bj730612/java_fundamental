import java.util.Scanner;

public class break02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		
/*		while(true) {
			System.out.print("���� �Է�(0�� �Է��ϸ� ����) : ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}*/
		
		for(;;) {
			System.out.print("���� �Է�(0�� �Է��ϸ� ����) : ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
		
			sum += num;
		}
		System.out.println("�Է��� ���� �� : " + sum);
			
		sc.close();
	}

}
