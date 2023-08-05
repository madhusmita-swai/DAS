import java.util.Arrays;

public class rearrangeEventAndPosition {
    ///Rearrange array such that even positioned are greater than odd

    static void reArrangePosition(int arr[], int n)
    {
        for(int i = 1; i<n; i++){
            if(i%2==0){
                if(arr[i]>arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }else {
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 3, 2, 2, 5 };
        reArrangePosition(arr, n);
    }
}
