package By_Step_level.step03_for.Q15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException { //예외처리를 꼭 해줘야한다.

        //Scanner와 유사
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println();과 유사
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해
        //입력받은 값을 공백단위로 구분하여 순서대로 호출 할 수 있다.
        StringTokenizer st;

        //입력은 readLine(); 메서드를 활용하는데,
        //String으로 고정되기 때문에 다른 타입으로 받으려면 형변환을 꼭 해줘야 한다.
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        bw.flush();
        bw.close();

    }
}
