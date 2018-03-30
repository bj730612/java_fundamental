
public class MethodTest07 {
	
	static int x = 700; // 전역 변수 (global variable)
	static int y = 900;
	
	public static void printx() {
		System.out.println("x3 = " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("x1 = " + x);
		
		int x = 800; // 지역 변수 (local variable)
		
		System.out.println("x2 = " + x);
		
		printx();
		
		System.out.println("x4 = " + MethodTest07.x);
		
		System.out.println("y = " + y);
		
	}

}
