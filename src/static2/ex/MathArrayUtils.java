package static2.ex;
class MathArrayUtils {
    private MathArrayUtils() {}
    public static int sum(int[] array) {
        int total = 0;
        for (int n : array) {
            total += n;
        }
        return total;
    }
    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }
    public static int min(int[] array) {
        int min = array[0];
        for (int n : array) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int n : array) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
