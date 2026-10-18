public class Scores {

    public int secondHighest(int[] scores) {
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score > second && score < highest) {
                second = score;
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] scores = {50, 50, 50};

        Scores s = new Scores();
        System.out.println(s.secondHighest(scores));
    }
}