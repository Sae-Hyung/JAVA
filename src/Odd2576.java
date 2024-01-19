import java.util.*;

public class Odd2576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;	//홀수들의 합
		int min = 999999;	//최솟값
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 7; i++)
		{
			int n = scanner.nextInt();
			
			if(n%2 != 0)
			{
				sum += n;
				min = Math.min(n, min);
			}
		}
		
		if(sum == 0)
		{
			System.out.println(-1);
		}
		
		else
		{
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

}
