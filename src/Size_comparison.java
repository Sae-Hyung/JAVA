package SWEA.D1;

import java.util.*;

public class Size_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();	//테스트케이스
		
		for(int testcase = 1; testcase <= T; testcase++)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(a < b)
			{
				System.out.println("#" + testcase + " " + "<");
			}
			else if(a > b)
			{
				System.out.println("#" + testcase + " " + ">");
			}
			else
			{
				System.out.println("#" + testcase + " " + "=");
			}
		}
	}

}
