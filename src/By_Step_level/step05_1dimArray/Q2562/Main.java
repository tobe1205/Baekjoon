package By_Step_level.step05_1dimArray.Q2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //크기가 9인 정수배열에 각각 정수 입력
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            count++;
            if(max < arr[i]){
                max = arr[i];
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
