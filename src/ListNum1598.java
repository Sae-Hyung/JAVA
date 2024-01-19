import java.util.Scanner;

public class ListNum1598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력을 두개 받고 각각 4로나눴을때 몫의차, 나머지의차 구해서 절대값(길이)을 더해주면됨
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt() - 1;
		int b = scanner.nextInt() - 1;
		
		int width = 0;	//가로(몫의 차)
		int height = 0;	//세로(나머지의 차)
		
		width = (a / 4) - (b / 4);
		height = (a % 4) - (b % 4);
		
		System.out.println(Math.abs(width) + Math.abs(height));
	}

}
