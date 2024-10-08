/*
Given a route containg & direction(E,W,N,S), find the shortest path to reach destination.  (for WNEENESENNN)
 @author Vikash Kumar Gupta
*/
public class direction {
    public static double printShortPath(String str) {
        int x=0, y=0;
        for(int i=0; i<str.length();i++) {
            char dir = str.charAt(i);
            if(dir == 'S') {
                y--;
            }
            else if(dir == 'N') {
                y++;
            }
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        // int x2 = x*x;
        // int y2 = y*y;
        return Math.sqrt(x*x + y*y);// return under root x2-x2 y2-y2  , x2 = x square, y2 = y square
    }
    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.println(printShortPath(str));
    }
}
