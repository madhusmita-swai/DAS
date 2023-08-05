import java.util.Arrays;

public class findNumberOfTriangle {
    static void findTriangle(int arr[], int n){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j< n; j++){
                for (int k = j+1; k<n; k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int size = arr.length;
        findTriangle(arr, size);
    }
}
