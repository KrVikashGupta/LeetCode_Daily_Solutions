/*
@ author Vikash Kumar Gupta

*/
public class substring {
    public static String printsubstring(String str, int si, int ei) {
        String substr = "";

        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String arg[]) {
        String str = "Helloworld";
        System.out.println(str.substring(0,9));
        //System.out.println(printsubstring(str, 0,6));
    }
}
