public class myRec6 {
    //find first occurence of key in array
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,3,2};
        int key =3;
        System.out.println (firstoccur(arr,key,0));
    }
    public static int firstoccur(int arr[],int key , int i){
        if (i == arr.length){     //base case
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
       return firstoccur(arr, key, i+1);
    }
}
