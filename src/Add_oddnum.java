package SWEA.D1;

import java.util.*;

public class Add_oddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();	//테스트케이스
		
		for(int testcase = 1; testcase <= T; testcase++)
		{
			int sum = 0;
			for(int j = 0; j < 10; j++)
			{
				int num = scanner.nextInt();
				if(num % 2 != 0)
				{
					sum += num;
				}
			}
			System.out.println("#" + testcase + " " + sum);
		}
	}

}
