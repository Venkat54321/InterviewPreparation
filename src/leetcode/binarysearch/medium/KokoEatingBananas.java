package leetcode.binarysearch.medium;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] array = {30,11,23,4,20};
        int hour = 6;
        int minimBananaToEat = kokoEatingBanana(array,hour);
        System.out.println(minimBananaToEat);
    }

    private static int kokoEatingBanana(int[] array, int hour) {
        int min = 1;
        int max = 0;
        for(int i: array){
            max = Math.max(i,max);
        }
        while(min < max) {
            int mid = min + (max - min) / 2;
            if(canEatBananas(array,min,hour)){
                max = mid ;
            }else{
                min = mid + 1;
            }
        }
        return min;
    }

    private static boolean canEatBananas(int[] array, int speed,int hour) {
        int canEatBanana= 0;
        for(int i : array){
            int div = i / speed;
            canEatBanana += div;
            if(i % speed != 0) canEatBanana++;
        }
        return canEatBanana <= hour;
    }
}
