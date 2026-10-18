public class SearchinRotatedSortedArray {

    public static int search(int tar, int arr[]) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (arr[mid] == tar)  return mid;

            if (arr[st] <= arr[mid]) {

                if (tar >= arr[st] && tar < arr[mid]) {
                    end = mid - 1;
                } 
                else {
                    st = mid + 1;
                }

            }
            else {

                if (tar > arr[mid] && tar <= arr[end]) {
                    st = mid + 1;
                } 
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int tar = 0;
        int arr[] = {2, 3, 4, 5, 0, 1};

        System.out.println(search(tar, arr));
    }
}