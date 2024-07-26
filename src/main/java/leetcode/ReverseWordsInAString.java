package leetcode;

import javax.swing.*;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String input = "a good   example";
        String[] arryOfString = input.trim().split("\\s+");
        String result = "";

        int start = 0;
        int end = arryOfString.length - 1;
        while (start < end) {
            String temp = arryOfString[start];
            String tempEnd = arryOfString[end];
            arryOfString[end] = temp;
            arryOfString[start] = tempEnd;
            start++;
            end--;
        }
        for (int i = 0; i < arryOfString.length; i++) {
            if (arryOfString[i] != ""){
                if (i == 0) {
                    result += arryOfString[i];
                } else {
                    result += " " + arryOfString[i];
                }
            }

        }

        System.out.println("--"+result+"--");
    }
}
