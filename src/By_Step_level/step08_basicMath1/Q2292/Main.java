package By_Step_level.step08_basicMath1.Q2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 1; //겹수(최소 루트)
        int range = 2; //범위(최솟값 기준)

        if (N == 1) { //N이 1일 경우는 바로 1출력
            System.out.print(1);
        } else {
            while (range <= N) {
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.print(cnt);
        }
    }
}
