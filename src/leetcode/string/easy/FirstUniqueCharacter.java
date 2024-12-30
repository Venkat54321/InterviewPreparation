package leetcode.string.easy;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aabb";
        int index = firstUniqueCharIndex(str);
        System.out.println(index);
    }

    private static int firstUniqueCharIndex(String str) {
        int[] indexArray = new int[26];
        char[] charArray = str.toCharArray();
        for(int i = 0; i<= charArray.length -1;i++){
            indexArray[charArray[i] - 'a']++;
        }
        for(int i = 0;i <= charArray.length - 1;i++){
            int index = charArray[i] - 'a';
            if(indexArray[index] == 1){
                return i;
            }
        }
        return -1;
    }
}
