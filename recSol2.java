public class recSol2 {
    //Print the numeral in words
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        
       
        printInWords(1947);
        
    }
    public static void printInWords(int n){
        if(n ==0 ){                 //base case
            return;
        }
        int lastDigit = n%10;
        printInWords(n/10);
        System.out.print(digits[lastDigit] + " ");
        
    }
}
