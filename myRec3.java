public class myRec3 {
    //sum of first n natural no.
    public static void main(String[] args) {
        int n =30;
        System.out.println(sumn(n));
    }
    public static int sumn(int n){
        if (n==1){                //base case
            return 1;
        }
        int summn = n + sumn(n-1);
        return summn;
    }
}
