package By_Step_level.step05_1dimArray.Q3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.print(h.size());
    }
}
