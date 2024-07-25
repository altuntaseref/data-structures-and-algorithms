package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        int[] exampleArray = {2, 7, 4, 1, 8, 1};
        String s = "leetcode";
        //reverseArray(exampleArray);
        reverseStringArray(s);

    }

    public static void searchIndex(int[] exampleArray) {
        for (int i = 0; i < exampleArray.length; i++) {
            if (exampleArray[i] == 4) {
                System.out.println(i);
            }
        }
    }

    public static void reverseArray(int[] exampleArray) {
        int start = 0, end = exampleArray.length - 1;
        while (start < end) {
            int temp = exampleArray[start];
            exampleArray[start] = exampleArray[end];
            exampleArray[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseStringArray(String s) {
        List<String> vowelsLetters = new ArrayList<>();
        vowelsLetters.add("a");
        vowelsLetters.add("e");
        vowelsLetters.add("i");
        vowelsLetters.add("o");
        vowelsLetters.add("u");


        List<String> stringList = new ArrayList<>();
        List<String> voweList = new ArrayList<>();
        int indexVowel = 0;

        for (int i = 0; i < s.length(); i++) {
            stringList.add(String.valueOf(s.charAt(i)));
            if (vowelsLetters.contains(String.valueOf(s.charAt(i)).toLowerCase())) {
                voweList.add(String.valueOf(s.charAt(i)));
            }
        }

        int start1 = 0, end1 = voweList.size() - 1;

        while (start1 < end1) {
            String temp = voweList.get(start1);
            voweList.set(start1, voweList.get(end1));
            voweList.set(end1, temp);
            start1++;
            end1--;
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (vowelsLetters.contains(stringList.get(i).toLowerCase())){
                stringList.set(i,voweList.get(indexVowel));
                indexVowel ++;
            }
        }

        String result = "";

        for (String string : stringList) {
            result = result+string;
        }



        System.out.println(result);
    }
}
