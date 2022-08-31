public class myRec9 {
    //ways in which n tiles can be arranged each of 2*1 size in board of size 2*n.
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
    public static int tilingProblem(int n){
        if(n==0 || n ==1){         //base case
            return 1;
        }
        //verticle
        int fnm1 = tilingProblem(n-1);
        //horizontal
        int fnm2 = tilingProblem(n-2);
       return fnm1+fnm2;
    }
}
