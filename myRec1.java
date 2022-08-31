public class myRec1 {
    //print 1 to n inc order.
    public static void main(String[] args) {
        int n =5;
        printDec(n);
    }
    public static void printDec(int n){
        if(n==1){                          //Base case
            System.out.print(n + " ");
            return;
        } 
         printDec(n-1);
        System.out.print(n + " ");
    }
   
    }

