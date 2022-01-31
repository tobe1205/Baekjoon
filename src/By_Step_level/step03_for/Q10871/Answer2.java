package By_Step_level.step03_for.Q10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < x)
                sb.append(value).append(" ");
        }
        System.out.print(sb);
    }
}
