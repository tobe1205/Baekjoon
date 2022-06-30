package By_Step_level.step02_if.Q2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int endTime = Integer.parseInt(br.readLine());

        h += endTime / 60;
        m += endTime % 60;

        if (m > 59) {
            h += 1;
            m -= 60;
        }
        if (h > 23) {
            h -= 24;
        }

        System.out.println(h + " " + m);

    }
}