public class myRecursion {
    //print n to 1 dec order
     .

     public static void main(String[] args) {
        int n =5;
        printDec(n);
    }
    public static void printDec(int n){
        if(n==1){              //Base case
            System.out.println(n);
            return;
        } 
        System.out.print(n + " ");
        printDec(n-1);
    }
}
