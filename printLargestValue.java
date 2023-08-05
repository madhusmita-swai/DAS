public class printLargestValue {
    static int  i , first, second, third;
    private static void print3largest(int arr[], int arr_size){
         first=second=third= Integer.MIN_VALUE;
         for (i=0; i< arr_size; i++){
             if(arr[i]>first){
                 third = second;
                 second = first;
                 first = arr[i];
             } else if (arr[i]>second) {
                 third = second;
                 second = arr[i];

             } else if (arr[i]>third) {
                 third = arr[i];
             }

         }
        System.out.println("print top 3 largest Number"+ first+"second " +second+"third"+third);
    }
    public static void main(String[] args) {
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        int n = arr.length;
        print3largest(arr, n);

    }
}
