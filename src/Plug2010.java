import java.util.Scanner;

public class Plug2010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();	//멀티탭개수
		int result = 1;
		
		for(int i = 0; i < N; i++)
		{
			int a = scanner.nextInt();
			result = result + a - 1;
		}
		System.out.println(result);
		
	}

}
