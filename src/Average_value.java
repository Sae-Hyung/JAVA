package SWEA.D1;

import java.util.*;

public class Average_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();	//테스트케이스
		
		for(int testcase = 1; testcase <= T; testcase++)
		{
			double avg = 0;
			double sum = 0;
			for(int i = 0; i < 10; i++)
			{
				int num = scanner.nextInt();
				
				sum += num;
				avg = Math.round(sum / 10.0);
			}
			System.out.println("#" + testcase + " " + String.format("%.0f", avg));
		}
	}

}
