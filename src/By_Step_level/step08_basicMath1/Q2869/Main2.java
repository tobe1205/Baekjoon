package By_Step_level.step08_basicMath1.Q2869;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int count = 0;
        int height = 0;

        for (; ; ) {
            height += A;
            count++;
            if (height >= V) {
                break;
            }
            height -= B;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}