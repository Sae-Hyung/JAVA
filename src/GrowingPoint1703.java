import java.util.Scanner;

public class GrowingPoint1703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (((3*2)-1)*2)-3
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int a = scanner.nextInt();	// 나무의 나이 a
			if(a == 0)	// 0이 주어지면 더이상 입력X
			{
				break;
			}
			int result = 1;	// 맨 처음 가지 1개
			for(int i = 0; i < a; i++)
			{
				int x = scanner.nextInt();	// splitting factor
				int y = scanner.nextInt();	// 가지치기
				
				result = (result * x) - y;
			}
			System.out.println(result);
		}
		
		
		
	}

}
