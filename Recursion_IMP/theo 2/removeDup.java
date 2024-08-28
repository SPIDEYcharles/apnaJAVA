public class removeDup {

    public static void removeDupChar(String str, int idx, StringBuilder newStr,boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);   // base case
            return;
        }

        // work to do

        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            // duplicates
            removeDupChar(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDupChar(str, idx+1, newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "apple";
        removeDupChar(str, 0, new StringBuilder(""), new boolean[26]);
    }
}



            //revise again and revise string concept