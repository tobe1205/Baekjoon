package By_Step_level.step02_if.Q2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int price = 0;

        if (A == C && B == C) { //3개가 다 같을 경우
            System.out.print((A * 1000) + 10000);
        }
        else if (A == B || A == C) {
            System.out.print((A * 100) + 1000);
        }
        else if (B == C) {
            System.out.print((B * 100) + 1000);
        }
        else { //3개의 눈이 다 다른경우
            System.out.print((Math.max(A, Math.max(B, C))*100));
        }

    }
}
