import java.util.*;

public class goodsection1059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();	//집합크기
		int[] S = new int[L];	//집합
		for(int i = 0; i < L; i++)
		{
			S[i] = scanner.nextInt();
		}
		int n = scanner.nextInt();	//n
		
		Arrays.sort(S);	//S배열 오름차순
		
		int max = 0;
		int min = 0;
		
		
		//집합맨앞 숫자부터 2개씩 n이랑 비교
		if(n < S[0])	//만약 n이 첫원소보다도 작으면 min은 0으로해야 1부터 카운팅되서 max만 첫원소로설정하고 계산
		{
			max = S[0];
		}
		
		else
		{
			for(int i = 0; i < L - 1; i++)
			{
				if(S[i] == n || S[i + 1] == n)	//집합에 n이있는경우
				{
					System.out.println(0);
					return;
				}
				else if(S[i] < n && S[i + 1] > n)
				{
					max = S[i + 1];
					min = S[i];
				}
			}
		}
		
		
		//n기준으로 왼쪽부터 max-1까지 n포함시켜서 경우의수계산
		int tmp = 0;
		
		for(int i = min + 1; i <= n; i++)
		{
			for(int j = n; j <= max - 1; j++)
			{
				if(i != j)
				{
					tmp++;
				}
			}
		}
		
		System.out.println(tmp);
	}

}
