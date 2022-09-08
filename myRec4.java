public class myRec4 {
    //nth fibonacci no.
    public static void main(String[] args) {
        int n = 20;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if (n==0 || n ==1){                 //2 base cases
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
}
