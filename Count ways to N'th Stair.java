class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        return (long) (Math.floor(n/2))+1;
    }
}
