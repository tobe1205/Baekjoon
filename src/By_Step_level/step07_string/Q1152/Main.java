package By_Step_level.step07_string.Q1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim(); //공백

        if(s.isEmpty()) { //빈문자열이라면 0을 출력
            System.out.println(0);
        }
        else {
            System.out.println(s.split(" ").length);
        }
    }
}
