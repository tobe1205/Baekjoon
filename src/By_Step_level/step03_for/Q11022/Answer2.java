package By_Step_level.step03_for.Q11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int fNum = Integer.parseInt(st.nextToken());
            int sNum = Integer.parseInt(st.nextToken());

            sb.append("Case #"+ i + ": ").append(fNum + " + " + sNum + " = " + (fNum+sNum)).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
