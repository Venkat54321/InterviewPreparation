package leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] array = {"bella","label","roller"};
        List<String>  commonChars = getCommonChars(array);
        for(String c : commonChars){
            System.out.print(c + " ");
        }
    }

    private static List<String>  getCommonChars(String[] array) {
        List<String> result = new ArrayList<>();
        int[] commonCharIntegerArray = new int[26];
        int[] currentCommonChars =  new int[26];

        for(char c : array[0].toCharArray()){
            commonCharIntegerArray[c - 'a']++;
        }

        for(int i = 1;i<= array.length -1;i++){
            Arrays.fill(currentCommonChars,0);

            char[] charArray = array[i].toCharArray();
            for(int j = 0;j<= charArray.length - 1;j++){
                currentCommonChars[charArray[j] - 'a']++;
            }

            for(int common = 0;common<26;common++){
                int min = Math.min(commonCharIntegerArray[common],currentCommonChars[common]);
                commonCharIntegerArray[common] = min;
            }
        }

        // getting result
        for(int i = 0; i<26;i++){
            for(int common = 0; common < commonCharIntegerArray[i];common++){
                result.add(String.valueOf((char) (i + 'a')));
            }
        }


        return result;
    }
}
