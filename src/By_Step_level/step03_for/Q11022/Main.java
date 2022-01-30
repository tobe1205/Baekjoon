package By_Step_level.step03_for.Q11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //테스트 케이스 개수 T
        int T = sc.nextInt();

        //정수 2개 변수 생성
        int x;
        int y;

        for (int i = 1; i <= T; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i,x,y,x+y);
        }
    }
}
