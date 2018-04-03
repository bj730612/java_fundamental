package test;

import shape.*;

public class ShapeTest01 {
	public static void main(String[] args) {
		// 1번 배열 만들기
/*		Shape[] s = new Shape[3];
		
		s[0] = new Rectangle();
		s[1] = new Triangle();
		s[2] = new Circle();*/
		
		// 2번 배열 만들기
		Shape[] s = new Shape[] {
				new Rectangle(),
				new Triangle(),
				new Circle()
		};
		
		for(int i=0; i<s.length; i++) {
			s[i].draw();
		}
		
		System.out.println("**********");
		
		// 2번 확장 for문
		
		for(Shape p : s) {
			p.draw();
		}
	}

}
