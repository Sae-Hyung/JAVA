package SWEA.D1;

import java.util.*;

public class max_num {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();	//테스트케이스
		
		for(int testcase = 1; testcase <= T; testcase++)
		{
			int[] S = new int[10];
			for(int i = 0; i < 10; i++)
			{
				S[i] = scanner.nextInt();
			}
			Arrays.sort(S);
			System.out.println("#" + testcase + " " + S[9]);
		}
	}
}
