package By_Step_level.step04_while.Q10952;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                sc.close();
                break;
            }
            System.out.println(A+B);
        }


    }
}