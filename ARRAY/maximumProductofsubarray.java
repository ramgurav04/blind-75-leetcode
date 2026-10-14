public class maximumProductofsubarray {
    public static int maxP(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int r = 0;
        int l = 0;
        for(int i=0; i<n; i++){
            if(r == 0){
                r = 1;
            }
            if(l == 0){
                l = 1;
            }
            r *= arr[i];
            // l *= arr[n - i+1];
            ans = Math.max(ans, Math.max(r, l));
        }
        return  ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,4};
        System.out.println(maxP(arr));
    }
}
