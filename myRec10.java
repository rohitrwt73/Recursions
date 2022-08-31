public class myRec10 {
    //remove duplicates in string.
    public static void main(String[] args) {
        String str = "appnnacollege";
       printDup(str, 0, new boolean[26],new StringBuilder (""));
        
    }
    public static void printDup(String str, int idx, boolean map[],StringBuilder newStr ){
        if(idx == str.length()){           //base caseṁ
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            printDup(str, idx+1, map, newStr);
        }
        else{
            map[currChar -'a'] = true;
            printDup(str, idx+1, map, newStr.append(currChar));

        }
    }
}
