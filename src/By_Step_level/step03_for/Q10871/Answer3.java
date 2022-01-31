package By_Step_level.step03_for.Q10871;

import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i++) {

            int value = in.nextInt();
            if(value < X) {
                sb.append(value+" ");
            }
        }
        System.out.println(sb);
    }
}
