import java.util.Scanner;

public class Array03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� ���� ó�� ���α׷�");
		System.out.print("�л� �� �Է� : ");
		int n = sc.nextInt();
		
		int[] st = new int[n];
		int sum = 0;
		
		for(int i = 0; i < st.length; i++) {
			System.out.print(i + 1 + "��° �л� ���� : ");
			st[i] = sc.nextInt();
			sum += st[i];
		}
		System.out.println(7 + 7 + "");
		System.out.println("" + (7 + 7));
		System.out.println();
		System.out.println(st.length + "���� �հ� : " + sum);
		System.out.println(st.length + "���� ��� : " + (double)sum/st.length);
		
		sc.close();
		
	}

}
