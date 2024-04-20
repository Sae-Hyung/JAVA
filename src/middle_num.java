package SWEA.D1;

import java.util.*;

public class middle_num {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();	//테스트케이스
		int[] S = new int[199];
		
		for(int i = 0; i < 199; i++)
		{
			S[i] = scanner.nextInt();
		}
		Arrays.sort(S);
		System.out.println(S[99]);
		
	}
}
