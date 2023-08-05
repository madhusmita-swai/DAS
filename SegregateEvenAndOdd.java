import java.util.Arrays;

public class SegregateEvenAndOdd {
    //Segregate even and odd numbers
    static void segregate(int[] arr, int n){
        int[] temp = new int[n];
        int index = 0;
        for(int i=0; i<n;i++){
            if(arr[i]%2==0){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<n;i++){
            if(arr[i]%2!=0){
                temp[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;

        // Function call
        segregate(arr, n);
    }
}
