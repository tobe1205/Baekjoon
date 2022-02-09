package By_Step_level.step05_1dimArray.Q8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[sc.nextInt()];

        //배열에 각각 값 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;    // 연속횟수
            int sum = 0;    // 누적 합산

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}