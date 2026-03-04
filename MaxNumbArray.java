public class MaxNumbArray {
    public static void main(String[] args) {
        int[] n = {0, 4, 5, 6, 8, 3, 44, 64, 0, 54};
        int max = n[0];
        for (int x : n) if (x > max) max = x;
        System.out.print(max);
    }
}