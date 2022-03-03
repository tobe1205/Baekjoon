package By_Step_level.step07_string.Q2908;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = reverseNum(sc.nextInt());
        int b = reverseNum(sc.nextInt());

        System.out.print(a > b? a:b);
    }

    static int reverseNum(int num){
        String number = String.valueOf(num);
        String temp = "";
        for (int i = number.length(); i > 0; i--) {
            temp += number.charAt(i-1);
        }
        return Integer.parseInt(temp);
    }
}