import java.util.Scanner;

public class Array2DTest06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][5];
		String retry = null;
		
		System.out.println("운수 테스트 프로그램");
		do {
			System.out.print("행운의 수(1~45) : ");
			int n = sc.nextInt();
			int count = 0;
			
/*			// 2차원 배열에 난수를 생성해서 대입
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = (int) (Math.random() * 45) + 1;
				}
			}
			
			// 2차원 배열의 값을 출력
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(n == a[i][j]) {
						System.out.printf("%5d", a[i][j]);
					}
				System.out.println();
			}
			
			// 행운의 수와 2차원 배열의 값(난수)을 비교
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
				System.out.println("보통 날입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날입니다.");
				break;
			case 3:
				System.out.println("운수 대통인 날입니다.");
				break;
			case 4:
				System.out.println("대박인 날입니다.");
				break;
			default:
				System.out.println("울트라 짱 대박인 날입니다.");
				break;
			}
			System.out.println("맞추신 갯수는 " + count + "개 입니다.");
			System.out.print("한번 더 하시겠습니까?(Y/N) : ");
			retry = sc.next();
		} while(retry.equalsIgnoreCase("y"));
		
		sc. close();
		
	}

}
