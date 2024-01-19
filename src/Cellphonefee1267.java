import java.util.Scanner;

public class Cellphonefee1267 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//무한반복문으로 계속 입력받다가 0이면 탈출
		while(true)
		{
			String Num = scanner.nextLine();
			if(Num.length() == 1 && Num.charAt(0) == '0')
			{
				break;
			}
			int length = 1;
			for(int i = 0; i < Num.length(); i++)
			{
				if(Num.charAt(i) == '1')
				{
					length += 3;
				}
				else if(Num.charAt(i) == '0')
				{
					length += 5;
				}
				else
				{
					length += 4;
				}
			}
			System.out.println(length);
		}
		
	}
}
