import java.util.Scanner;

public class BlockTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;

		System.out.print("밑변 길이를 입력하세요 : ");
		int n = sc.nextInt();

		for(i=0; i<=(n-1)/2; i++)
		{
			for(j=0; j<(n-1)/2-i; j++)
			{
				System.out.print("  ");
			}
			for(j=0; j<(2*i)+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(i=0; i<(n-1)/2; i++)
		{
			for(j=0; j<i+1; j++)
			{
				System.out.print("  ");
			}
			for(j=0; j<n-2-(2*i); j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}