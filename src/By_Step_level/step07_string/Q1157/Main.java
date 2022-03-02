package By_Step_level.step07_string.Q1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26]; //알파벳은 총 26개
        String S = sc.next().toUpperCase(); //대문자로 입력받기위해 toUpperCase() 사용


        for (int i = 0; i < S.length(); i++) {
            int num = S.charAt(i) - 'A';
            arr[num]++;
        }

        // System.out.println(Arrays.toString(arr));
        int max = 0; //제일 많이 사용한 알파벳 중복값을 찾기위해 변수 생성
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer = (char) (i + 'A');
            } else if (max == arr[i]) {
                answer = '?';
            }
        }
        System.out.print(answer);
    }
}
