class TwoSum {
    public static int[] twosum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = twosum(arr, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}