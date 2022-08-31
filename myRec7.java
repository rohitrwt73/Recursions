public class myRec7 {
    //find last occurence of key in array
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,3,2};
        int key =3;
        System.out.println (lastoccur(arr,key,0));
    }
    public static int lastoccur(int arr[], int key, int i){
        if(i == arr.length){            //base case
            return -1;
        }
        int isFound = lastoccur(arr, key, i+1);
        if(isFound ==-1 && arr[i]== key){
            return i;
        }
        return isFound;
    }
}
