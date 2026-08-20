class Solution {
    public boolean isRobotBounded(String instructions) {

        // 0 = North
        // 1 = East
        // 2 = South
        // 3 = West
        int direction = 0;

        int x = 0;
        int y = 0;

        for (char c : instructions.toCharArray()) {

            if (c == 'G') {

                if (direction == 0) {
                    y++;          // North
                } 
                else if (direction == 1) {
                    x++;          // East
                } 
                else if (direction == 2) {
                    y--;          // South
                } 
                else {
                    x--;          // West
                }

            } 
            else if (c == 'L') {
                direction = (direction + 3) % 4;
            } 
            else if (c == 'R') {
                direction = (direction + 1) % 4;
            }
        }

        return (x == 0 && y == 0) || direction != 0;
    }
}
