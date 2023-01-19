public class Question3 {

    public static void main(String[] args) {

    }

    public static double getMedian (int[] series) {
        double median;
        if (series.length % 2 == 1) {
            int toRemove = series.length / 2;
            for (int i = 0; i < toRemove; i++) {
                series = removeHighest(series);
            }
            median = getHighest(series);
        } else {
            int toRemove = series.length / 2 - 1;
            for (int i = 0; i < toRemove; i++) {
                series = removeHighest(series);
            }
            int part1 = getHighest(series);
            series = removeHighest(series);
            int part2 = getHighest(series);
            median = (double) (part1 + part2) / 2;
        }
        return median;
    }

    public static int[] removeHighest (int[] series) {
        int highest = getHighest(series);
        int[] smallerArray = new int[series.length - 1];
        int j = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i] != highest) {
                smallerArray[j] = series[i];
                j++;
            }
        }
        return smallerArray;
    }

    public static int getHighest (int[] series) {
        int highest = series[0];
        for (int i = 1; i < series.length; i++) {
            if (series[i] > highest) {
                highest = series[i];
            }
        }
        return highest;
    }
}
