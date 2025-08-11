import java.util.*;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int length = Math.max(word1.length(), word2.length());
        StringBuilder merged = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if(i < word1.length()){
                merged.append(word1.charAt(i));
            }
            if(i < word2.length()){
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }
    public static void main(String[] args){
        //testcase1
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));

        //testcase2
        word1 = "wxyz";
        word2 = "rstuv";
        System.out.println(mergeAlternately(word1, word2));
    }
}
