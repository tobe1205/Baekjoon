package By_Step_level.step05_1dimArray.Q10818;

import java.util.Arrays;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        //오름차순으로 정렬해주는 메소드
        Arrays.sort(arr);
        /* 오름차순으로 정렬 시 최소값은 배열의 첫번째 원소(index 0),
        최대값은 배열의 마지막 원소(arr.length-1)가 되므로 이것을 출력하면 된다.
        */
        System.out.printf("%d %d",arr[0], arr[arr.length -1]);

    }
}
