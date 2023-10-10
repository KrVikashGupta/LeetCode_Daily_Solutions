import java.util.*;
// Step-1 : calculate left max boundary - in the form of array
// Step-2 : calculate right max boundary - in the form of array
// Step-3 : loop
// Step-4 : waterLevel = min(leftmax bound, rightmax bound)
// Step-5 : trapped water = waterLevel - height(BarLevel)

public class trappedRainwater {   //  Time complexity : o(n)
    public static int trappedRain(int height[]) {
        int n = height.length;
        //calculate left max boundary - in the form of array
        int leftMax[] = new int[n];   //create an array
        leftMax[0] = height[0];  //1st bar kae lia

        for(int i=1; i<n; i++) {    // baaki sab kae lia loop laganaa hai
            leftMax[i] = Math.max(height[i],leftMax[i-1]); // height[i] = current value, aur uskae pahalae wala  sab
        }

        //calculate right max boundary - in the form of array
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1]; //    right side sae first wala calculate karna hai islia n-1

        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);// curr.value, right side uskae aagae wala
        }


        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(rightMax[i],leftMax[i]);

            //trapped water = waterLevel - height(BarLevel)
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;



    }
    public static void main(String args[]) {
        int height [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRain(height));
    }
    
}
