package By_Step_level.step07_string.Q11720;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] arr = sc.next().split("");

        int sum = 0;

        int N = Integer.parseInt(s);
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.print(sum);
    }
}
