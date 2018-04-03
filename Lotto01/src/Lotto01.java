import java.util.Scanner;

public class Lotto01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] com = new int [6];
		int [] user = new int [6];
		int i, j, cnt = 0;
		System.out.println("6개의 정수를 입력하세요.(1~45)");
		
		for(i=0; i<com.length; i++) {
			com[i] = (int)(Math.random() * 45) + 1;
			for(j=0; j<i; j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		for(i=0; i<user.length; i++) {
			user[i] = sc.nextInt();
			for(j=0; j<i; j++) {
				if(user[i]==com[j]) {
					cnt++;
				}
			}
		}
		for(i=0; i<com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println("");
		for(i=0; i<user.length; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.println(cnt + "개 맞췄습니다.");
		
		sc.close();
		
	}
}