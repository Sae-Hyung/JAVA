import java.util.Scanner;
import java.math.BigInteger;

public class Password1837 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 에라토스테네스의 체로 해야됨
		Scanner scanner = new Scanner(System.in);
		BigInteger K = new BigInteger(scanner.next());
		int l = scanner.nextInt();
		boolean check = false;	//소수면false 아니면 true
		boolean[] isnotprime = new boolean [l+1];
		isnotprime[1] = true;	//1은 소수가 아니니까 빼줌
		
		for(int i = 2; i <= l; i++)	//배수들은 어차피 소수가아니니까 true처리해줌
		{
			for(int j = 2; i * j <= l; j++)
			{
				isnotprime[i * j] = true;
			}
		}
		
		for(int i = 2; i < l; i++)	//false이고 i로 나누어떨어지면 true
		{
			if(!isnotprime[i] && K.mod(BigInteger.valueOf(i)) == BigInteger.ZERO)
			{
				System.out.println("BAD " + i);
				check = true;
				break;
			}
		}
		
		if(!check)	//소수가 아니면 GOOD출력
		{
			System.out.println("GOOD");
		}
		
	}

}
