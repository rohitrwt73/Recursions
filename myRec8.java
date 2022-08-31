public class myRec8 {
    // print x^n
    public static void main(String[] args) {
        int x= 2;
        int n=7;
        System.out.println(pow(x,n));
    }
    public static int pow(int x, int n){
        if(n==0){                       //base case
            return 1;
        }
        int powsq =pow(x,n/2)* pow(x,n/2); //even
        if(n %2 !=0){                    //odd
            return powsq*x;
        }
        return powsq;
    }
}
