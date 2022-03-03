package By_Step_level.step07_string.Q2908;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String arr[] = sc.nextLine().split(" ");
        int max = 0;

        for(int i=arr.length-1; i>=0; i--) {
            String temp = arr[i];
            String num = "";

            for(int j=temp.length()-1; j>=0; j--) {
                num += temp.charAt(j);
            }

            if(max < Integer.parseInt(num)) {
                max = Integer.parseInt(num);
            }
        }
        System.out.println(max);
    }
}