public class myRec11 {
    //pairing friends
    public static void main(String[] args) {
        System.out.println(friendsPair(12));
    }
    public static int friendsPair(int n){
        if(n==1 || n==2){             //2 Base cases
            return n;
        }
        return (friendsPair(n-1)+friendsPair(n-2)*(n-1));
    }
}
