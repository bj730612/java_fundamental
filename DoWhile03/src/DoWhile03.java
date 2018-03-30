import java.util.Scanner;

public class DoWhile03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month;
		String retry;
		
		do {
			
			do {
				System.out.print("계절을 표시합니다. 월 입력(1~12) : ");
				month = sc.nextInt();
			} while(month < 1 || month >12);
			
			switch(month) {
			case 3: case 4: case 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 1: case 2: case 12:
				System.out.println(month + "월은 겨울입니다.");
				break;
				}
			
			System.out.print("다시 한번 하시겠습니까?(Y/N) : ");
			retry = sc.next();
		} while (retry.equalsIgnoreCase("y"));
		
		System.out.println("계절 판별 프로그램을 종료합니다.");
		sc.close();
	}

}
