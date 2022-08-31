public class recSol1 {
    //print indices with key's value
    public static void main(String[] args) {
        int arr[]= {3,2,4,5,6,2,7,2,2};
        int key =2;
        allOccur(arr,key,0);
    }
    public static void allOccur(int arr[], int key, int i){
        if (i ==arr.length){          //base case
            return;
        }
        if(arr[i] == key){
            System.out.print(i+ " ");
        }
        allOccur(arr, key, i+1);
    }
}
