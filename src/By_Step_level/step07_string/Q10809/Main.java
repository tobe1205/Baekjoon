package By_Step_level.step07_string.Q10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print(s.indexOf(i)+ " ");
        }
    }
}

