package test;

import java.util.Scanner;
import point.Point;

public class PointTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� �Է� : ");
		int x = sc.nextInt();
		
		System.out.print("y�� �Է� : ");
		int y = sc.nextInt();
		
		Point p1 = new Point(x, y);
		System.out.println(p1.getLocation());
		
		sc.close();
	}

}
