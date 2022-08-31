public class myRec12 {
    //print all binary strings without consecutive 1's.
    public static void main(String[] args) {
        printbinStr(5,0,"");
    }
    public static void printbinStr(int n,int lastPlace,String str){
     if (n ==0){             //base case
        System.out.println(str); 
        return;
     } printbinStr(n-1, 0, str+"0");
       if(lastPlace ==0){
        printbinStr(n-1,1, str+"1");
     
       }
       
    }
}
