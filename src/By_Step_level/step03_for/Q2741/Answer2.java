package By_Step_level.step03_for.Q2741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
