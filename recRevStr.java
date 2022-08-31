public class recRevStr {
    public static void main(String[] args) {
        String str = "pathi";
        int n = str.length();
        printRev(str,n-1);
    }
    public static void printRev(String str, int idx){
        if( idx ==0){
            System.out.print(str.charAt(idx)); 
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
}
