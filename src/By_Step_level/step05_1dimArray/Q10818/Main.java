package By_Step_level.step05_1dimArray.Q10818;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int[] arr = new int[N];

        // 정수배열에 arr.length or N만큼 정수 입력을 받아 각각 저장한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //최대값 최소값 설정
        int max = arr[0]; //최대값
        int min = arr[0]; //최소값

        // arr[0]과 비교
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                 max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.printf("%d %d",min,max);
    }

}



