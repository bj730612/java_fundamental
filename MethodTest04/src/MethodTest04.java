import java.util.Scanner;

public class MethodTest04 {
	
	// 메소드 정의 (for)
	public static void drawStar(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("* ");
		}
	}
	
	// while
/*		int i = 1;
		while (i <= n) {
			System.out.print("* ");
			i++;
		}
	}*/
		
	// do while
/*		int i = 1;
		do {
			System.out.print("* ");
			i++;
		} while (i <= n);
	}*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- 메소드로 나누어 별표 찍기 ---");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		// while, do while, 다른 별찍기 연습
		
		// 방법 1 - 메소드로 나누지 않았을때
/*		for (int i = 1; i <=  n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		// 방법 2 - 메소드로 나눴을때 (for)
		for(int i = 1; i <= n; i++) {
			drawStar(i);
			System.out.println();
		}

		
		// while
/*		int i = 1;
		while (i <= n) {
			drawStar(i);
			System.out.println();
			i++;
		}*/ 
		
		// do while
/*		int i = 1;
		do {
			drawStar(i);
			System.out.println();
			i++;
		} while (i <= n);*/
				
		sc.close();
		
	}

}
