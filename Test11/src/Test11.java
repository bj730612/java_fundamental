import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계절 판별 프로그램");
		System.out.print("월을 입력하세요?(1~12) : ");
		int month = sc.nextInt();
		
		// 1번 방법
		if (month >= 3 && month <= 5 ) {
		System.out.println(month + "월은 봄입니다.");
		} else if (month >= 6 && month <=8) {
		System.out.println(month + "월은 여름입니다.");
		} else if (month >= 9 && month <=11) {
		System.out.println(month + "월은 가을입니다.");
		} else {
		System.out.println(month + "월은 겨울입니다.");
		}

	
		// 2번 방법
		if(month==3 || month==4 || month==5) {
		System.out.println(month + "월은 봄입니다.");
		} else if (month==6 || month==7 || month==8) {
		System.out.println(month + "월은 여름입니다.");
		} else if (month==9 || month==10 || month==11) {
		System.out.println(month + "월은 가을입니다.");
		} else {
		System.out.println(month + "월은 겨울입니다.");
		}
		sc.close();
		
		// 3번 방법
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6:	case 7:	case 8:
			System.out.println("여름입니다.");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("겨울입니다.");
			break;
		
		}
	}
}