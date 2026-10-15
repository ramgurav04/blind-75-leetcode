class minimumRotatedSortedArry{
    public static int min(int []arr){
        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int mid = (l+h) /2;
            if(arr[mid] > arr[h]){
                l = mid +1;
            }else{
                h = mid;
            }
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int []arr = {4,5,1,2};
        System.out.println(min(arr));
    }
}