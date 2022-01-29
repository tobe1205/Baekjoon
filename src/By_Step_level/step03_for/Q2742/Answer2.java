package By_Step_level.step03_for.Q2742;

import java.io.*;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        for (int i = x; i > 0; i--) {
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
