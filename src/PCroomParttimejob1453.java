import java.util.Scanner;

public class PCroomParttimejob1453 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();	//손님의 수
        boolean computer[] = new boolean[101];	//처음 컴퓨터총좌석 세팅
        int refuse = 0;	//거절당하는사람수

        for(int i = 0; i < N; i++)
        {
            int customer = scanner.nextInt();

            if(computer[customer] == true)	//손님이 이미 있을때
            {
                refuse++;
            }
            else
            {
                computer[customer] = true;  //없으면 좌석에 앉힘
            }
        }

        System.out.println(refuse);

    }

}
