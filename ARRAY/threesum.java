import java.util.*;
class threesum{
    public static List<List<Integer>> sum(int arr []){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length - 2; i++){
            if(i == 0 || (i > 0 && arr[i] != arr[i-1])){
                int lo = i + 1, hi = arr.length - 1, sum = 0 - arr[i];
                while(lo < hi){
                    if(arr[lo] + arr[hi] == sum){
                        ans.add(Arrays.asList(arr[i], arr[lo], arr[hi]));
                        while(lo < hi && arr[lo] == arr[lo + 1]) lo++;
                        while(lo < hi && arr[hi] == arr[hi - 1]) hi--;
                        lo++; hi--;
                    }
                    else if(arr[lo] + arr[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(sum(arr));
    }
}