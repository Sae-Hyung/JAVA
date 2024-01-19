import java.util.*;

public class DistributedProcessing1009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		int a;
		int b;
		int num;
		
		for(int i = 0; i < testcase; i++)
		{
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			num = 1;
			
			for(int j = 0; j < b; j++)
			{
				num = (num * a) % 10;
			}
			
			if(num == 0)
			{
				num = 10;
			}
			
			System.out.println(num);
		}
		
	}
}
