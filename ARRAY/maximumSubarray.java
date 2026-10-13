class maximumSubarray{
    public static int MaxSubArray(int arr []){
        int sum = 0;
        int maxS = arr[0];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > maxS){
                maxS = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxS;
    }
    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArray(arr));
    }
}