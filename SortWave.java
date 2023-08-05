import java.util.Arrays;

public class SortWave {
    static void swap(int arr[], int x, int y){
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    static void sortinWave(int arr[], int n){
        Arrays.sort(arr);
        for (int i =0; i<n-1; i+=2){
            swap(arr, i, i+1);

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        sortinWave(arr, n);
    }
}
