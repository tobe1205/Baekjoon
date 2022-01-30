package By_Step_level.step03_for.Q11021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.printf("Case #%d: %d\n", i,x+y);
        }
    }
}
