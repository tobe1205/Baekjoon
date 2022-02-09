package By_Step_level.step05_1dimArray.Q1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //최대값
        double max;

        int n = sc.nextInt();
        double[] arr = new double[n];

        //최대값 구하기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        sc.close();
        //총점수
        double total = 0;
        //Arrays.sort()를 이용해서 오름차순 정렬
        Arrays.sort(arr);
        max = arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            total += (arr[i] / max) * 100;
        }
        System.out.print(total / arr.length);
    }
}
