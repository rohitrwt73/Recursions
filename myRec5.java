public class myRec5 {
    // check if array is sorted
    public static void main(String[] args) {
    int arr []= {1,2,3,5};
   
   System.out.println( isSorted(arr,0));

    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){           //base case
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted (arr,i+1);
    }
}
