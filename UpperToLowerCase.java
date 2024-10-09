/* 
For a given string convert each the first letter of each word to uppercase"
case: hi, i am vikash o/p : Hi, I Am Vikash.
Uppercase : using java inbuild function (ch2 = character.toUpperCase(ch);

@author Vikash Kumar Gupta

*/

public class UpperToLower {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length() - 1) { // space kae baad uppercase chayia
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, i am vikash.";  // output tis Hi, I Am Vikash.
        System.out.println(toUpperCase(str));

    }
    
}
