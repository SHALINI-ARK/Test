import java.util.*;
class restoring {
    public static int maxways(List<Integer> arr, int k) {
        int n = arr.size();
        int total = 0;
        int[] prefix = new int[n];
        prefix[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr.get(i);
        }
        for (int i = 1; i < n; i++) {
            int left= prefix[i - 1];
            int right = prefix[n - 1] - prefix[i - 1];
            if (left == right) {
                total++;
            }
        }
        int maximum = total;
        for (int i = 0; i < n; i++) {
            int original = arr.get(i);
            arr.set(i, k);
            prefix[0] = arr.get(0);
            for (int j = 1; j < n; j++) {
                prefix[j] = prefix[j - 1] + arr.get(j);
            }

            int newway = 0;
            for (int j = 1; j < n; j++) {
                int left = prefix[j - 1];
                int right = prefix[n - 1] - prefix[j - 1];
                if (left == right) {
                    newway++;
                }
            }
            maximum = Math.max(maximum, newway);
            arr.set(i, original);
        }

        return maximum;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(2, -1, 2);
        int k1 = 3;
        System.out.println(maxways(arr1, k1)); 
    }
}
