import java.util.Scanner;

public class Lotto01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [6];
		int cnt = 0;
		System.out.println("6���� ������ �Է��ϼ���.(1~45)");
		
		for(int i=0; i<arr.length+1; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			System.out.print(arr[i] + " ");
		}
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.print((cnt+1) + "��° ���� �Է�:");
			int n = sc.nextInt();
			arr[i]=n;
			
		}*/
		
	}

}
