import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ��� ���α׷�");
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
        double avg = (double)sum / 3;
        
		System.out.println(("���� : " )+ sum);
        System.out.println(("��� : " )+ avg);
        
        String score;
        
        // 1�� ���
/*        if (avg >= 90.0) {
        	score = "A";
        } else if (avg >= 80.0) {
        	score = "B";
        } else if (avg >= 70.0) {
        	score = "C";
        } else if (avg >= 60.0) {
        	score = "D";
        } else {
        	score = "F";
        }*/
        
        // 2�� ���
        switch ((int)avg/10) {
        case 10: case 9:
        	score = "A";
        	break;
        case 8:
        	score = "B";
        	break;
        case 7:
        	score = "C";
        	break;
        case 6:
        	score = "D";
        	break;
        default:
        	score = "F";
        	break;
        }
        
        System.out.println("���� : " + score);
        
        sc.close();
	}
}
