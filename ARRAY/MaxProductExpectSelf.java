import java.util.Arrays;

public class MaxProductExpectSelf{
    public static int[] MaxP(int arr[]){
        int n = arr.length;
        int ans [] = new int[n];
        int ProductR = 1;
        int ProductL = 1;

        for(int i = n-1 ; i >=0 ; i--){
           ans[i] = ProductR;
           ProductR = arr[i] * ProductR;
        }
        for(int i=0 ; i<n ; i++){
            ans[i] = ans[i] * ProductL;
            ProductL = arr[i] * ProductL;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(MaxP(arr)));
    }
} 
