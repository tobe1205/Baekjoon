package By_Step_level.step07_string.Q1316;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i); //i번째 문자 저장(현재 문자)
            //앞선 문자와 i번째 문자가 같지 않다면?
            if (prev != now) {
                //해당 문자가 처음 나오는 경우(false인 경우)
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true; //true로 바꿔준다.
                    prev = now;              //다음 턴을 위해 prev도 바꿔준다.
                }
                //해당 문자가 이미 나온 적이 있는 경우 (그룹단어 x)
                else {
                    return false;
                }
                //앞선 문자와 i번째 문자가 같다면? (연속된 숫자)
                // else문 없어도 된다.
            } else {
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int cnt = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (check() == true) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
