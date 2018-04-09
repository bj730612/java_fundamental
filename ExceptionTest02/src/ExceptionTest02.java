
public class ExceptionTest02 {
	public static void main(String[] args) {
		System.out.println(10/5);
		System.out.println(10/2);
		System.out.println(10/3);
		
		try {
		System.out.println(10/0);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			// System.out.println(e.getMessage());
			// System.out.println("0으로 나눌 수 없다.");
		} catch(Exception e) {
			System.out.println();
		}
		
		System.out.println(10/4);
		
	}

}
