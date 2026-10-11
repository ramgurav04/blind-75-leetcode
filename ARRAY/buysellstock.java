public class buysellstock {
    public static int maxP(int arr[]){
        int n = arr.length;
        int maxProfit = 0;
        int buyP = arr[0];

        for (int i = 0; i < n; i ++){
            int currentP = arr[i] - buyP;
            if(currentP > maxProfit ){
                maxProfit = currentP;
            }
            if(arr[i] < buyP){
                buyP = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr [] = {7,1,6,2,9};
        System.out.println( "Max Profit : " + maxP(arr));
    }
}
