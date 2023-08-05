import java.util.Arrays;

public class PrintDuplicateElement {

    static void printDuplicate(int arr[], int n){
        for (int i=0; i<n; i++){
            int j =0;
            for ( j =0; j<i; j++){
                if(arr[i]==arr[j])
                    break;


            }
            if (i == j)
                System.out.print( arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        printDuplicate(arr, n);
    }
}
