package By_Step_level.step03_for.Q10871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int max = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < x; i++) {
            if (arr[i] < max) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
