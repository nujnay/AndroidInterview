package Microsoft.chapter_a;

public class Test_M_A_10 {

}
class Solution_M_A_10 {
    //f
    public int trap(int[] height) {
        int backIndex;
        int backHeight = 0;
        int frontIndex;
        int frontHeight = 0;
        int brick;
        int nowWater = 0;
        for (int i = 0; i < height.length; i++){
            int nowHeight = height[i];
            if (nowHeight > 0) {
                if(frontHeight == 0) {
                    frontIndex = i;
                    frontHeight = nowHeight;
                }
                if(backHeight == 0) {
                    backIndex = i;
                    backHeight = nowHeight;
                }
                if (nowHeight > frontHeight) {
                    frontHeight = nowHeight;
                    frontIndex = i;
                    if (frontHeight == backHeight) {

                    }
                }
            }
        }
    }
}