import java.util.Scanner;

public class Teamname1296 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // 연두
        int N = scanner.nextInt(); // 팀이름후보의개수

        int L = countChar(str, 'L');
        int O = countChar(str, 'O');
        int V = countChar(str, 'V');
        int E = countChar(str, 'E');

        int max = 0; // 확률 가장 작은숫자 0
        String str2 = "ZZZZZZZZZZZZZZZZZZZ"; // 사전순으로 가장 맨뒤단어 설정

        for (int i = 0; i < N; i++) {
            String str1 = scanner.next();	//앞에서 nextLine사용해서 next로입력
            int tL = countChar(str1, 'L');
            int tO = countChar(str1, 'O');
            int tV = countChar(str1, 'V');
            int tE = countChar(str1, 'E');

            int total = mod(L + tL, O + tO, V + tV, E + tE);

            if (max < total) {
                max = total;
                str2 = str1;
            } else if (max == total) {
                if (str2.compareTo(str1) > 0) {
                    str2 = str1;
                }
            }
        }

        System.out.println(str2);

    }

    // 문자열에서 특정문자 찾아주는 함수
    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static int mod(int l, int o, int v, int e) {
        return ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
    }
}

