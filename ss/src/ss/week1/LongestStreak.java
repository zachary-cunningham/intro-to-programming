package ss.week1;



public class LongestStreak {
    public static void main(String[] args) {

        int[] temps = {
                12, 13, 14, 15, 13, 14, 15, 16, 17, 12, 13, 14, 10, 11, 12, 13,
                12, 13, 14, 15, 16, 17, 18, 12, 11, 10, 9, 8, 7, 8, 9, 10, 11, 12
        };

        int streak = 1;
        int longestStreak = 1;
        for(var i = 0; i < temps.length-1; i++) {
            if(temps[i+1] > temps[i]) {
                streak ++;
            } else {
                streak = 1;
            }
            if (streak > longestStreak) {
                longestStreak = streak;
            }
        }

        System.out.println(longestStreak);

    }
}
