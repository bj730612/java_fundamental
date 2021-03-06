//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class Array04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//System.out.println("최대값 구하는 프로그램");
		System.out.println("최소값 구하는 프로그램");
		
		int[] a = new int[10];
		
		// 1번 방법 : 점수를 직접 입력
		
/*		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 점수 입력 : ");
			a[i] = sc.nextInt();
		}*/
		
		// 2번 방법 : 점수를 난수로 생성
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
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
		sc.close();
		
	}

}
