public class recSol4 {
    //We are given a string S,we need to find the count of all contiguous substrings starting and ending with the same character.
    //Sample Input 1: 
    //S = "abcab"
    //Sample Output 1: 7 
    //There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b Out of the above substrings,there are 
    //7 substrings:a,abca,b,bcab,c,aandb.So,only 7 contiguous substrings start and end with the same character.
    public static void main(String[] args) {
        String str ="adsaagj";
        int n = str.length();
        System.out.print(countsubstrs(str,0,n-1,n));
    }
    public static int countsubstrs(String str, int i, int j, int n){
        if(n <=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int res =countsubstrs(str, i+1, j, n-1)
                  + countsubstrs(str, i, j-1, n-1)
                  -countsubstrs(str, i+1, j-1, n-2);
                 if(str.charAt(i) == str.charAt(j)) {
                     res++;

    }return res;
    
}
}