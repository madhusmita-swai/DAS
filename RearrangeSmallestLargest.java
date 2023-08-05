import java.util.Arrays;

public class RearrangeSmallestLargest {
    //Rearrange an array in maximum minimum form using Two Pointer Technique
    static void rearrange(int arr[], int n){
        int[] temp = arr.clone();
        int small = 0, large = n-1;
        boolean flag = true;
        for(int i=0; i<n; i++){
            if(flag){
                arr[i]=temp[large--];
            }else {
                arr[i] = temp[small++];
            }
            flag = !flag;
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr, arr.length);

        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }
}
