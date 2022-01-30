package By_Step_level.step03_for.Q11021;

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

        for (int i = 1; i <= T ; i++) {
            st = new StringTokenizer(br.readLine()," ");
            sb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken())
                            +Integer.parseInt(st.nextToken())).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
