
public class Test04 {
	
	public static void main(String[] args) {
		final double PI; // 원주율
		PI = 3.14;
		//PI = 3.5;
		double r = 7.5; // 반지름
		
		//PI = 3.5;
		
		//byte b = 128;
		
//		float f = 3.14F;  F = float의 약자
//		long l = 10000000000L;  L = long의 약자
		
		// F, L = 접미사
		
		int i = 100;
		int oct = 0100;
		int hex = 0x100;
		
		System.out.println("원의 둘레 = " + (2*PI*r));
		System.out.println("원의 면적 = " + (PI*r*r));
		System.out.println("i = " + i);
		System.out.println("oct = " + oct);
		System.out.println("hex = " + hex);
		
	}

}
