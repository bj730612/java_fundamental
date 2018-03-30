import java.util.Scanner;

public class break02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		
/*		while(true) {
			System.out.print("정수 입력(0을 입력하면 종료) : ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}*/
		
		for(;;) {
			System.out.print("정수 입력(0을 입력하면 종료) : ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
		
			sum += num;
		}
		System.out.println("입력한 값의 합 : " + sum);
			
		sc.close();
	}

}
