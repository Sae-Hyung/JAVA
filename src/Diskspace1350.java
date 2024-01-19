import java.util.Scanner;

public class Diskspace1350 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();	//파일의 개수
		long size[] = new long[N];
		
		for(int i = 0; i < N; i++)
		{
			size[i] = scanner.nextInt();	//파일의 크기
		}
		
		int cluster = scanner.nextInt();	//클러스터의 크기
		
		long sum = 0;
		
		for(int i = 0; i < N; i++)
		{
			if(size[i] != 0)
			{
				if(size[i] > cluster)
				{
					if(size[i] % cluster != 0)
					{
						sum += ((size[i] / cluster)+1) * cluster;
					}
					
					else
					{
						sum += (size[i] / cluster) * cluster;
					}
				}
				else
				{
					sum += cluster;
				}
				
				
			}
			
		}
		System.out.println(sum);
		
	}

}
