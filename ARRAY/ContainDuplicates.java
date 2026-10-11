import java.util.Arrays;;
public class ContainDuplicates{
    public static boolean ContainDupli(int arr[]){
        Arrays.sort(arr);
        for(int i = 0; i< arr.length - 1; i++){
            if(arr[i] == arr[i+1]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,1};
        boolean r = ContainDupli(arr);
        System.out.println(r);
    }
}