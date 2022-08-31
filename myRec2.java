public class myRec2 {
    //return factorial of n.
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n)) ;
    }
    public static int fact(int n ){
        if(n==0){                          //Base case
                 return 1;
        }
        int factn = n*fact(n-1);
        return factn;
    }
}
