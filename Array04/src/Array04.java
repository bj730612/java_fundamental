//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class Array04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//System.out.println("�ִ밪 ���ϴ� ���α׷�");
		System.out.println("�ּҰ� ���ϴ� ���α׷�");
		
		int[] a = new int[10];
		
		// 1�� ��� : ������ ���� �Է�
		
/*		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� : ");
			a[i] = sc.nextInt();
		}*/
		
		// 2�� ��� : ������ ������ ����
		System.out.print("[ ");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(101);
			System.out.print(a[i] + ", ");
		}
		System.out.print("]");
		
		int max = a[0], min = a[0];
		
		for (int i=1; i<a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	
		sc.close();
		
	}

}
