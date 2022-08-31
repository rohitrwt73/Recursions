public class recSol3 {
    //length of a string
    public static int length(String str) {
        if(str.length() ==0) {          //base case
            return 0;
    }
    return length(str.substring( 1)) +1;
}
public static void main(String[]args) {
    String str="abcde";
    System.out.println(length(str));
}
}
