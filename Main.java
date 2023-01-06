package searchinsert.solution;

public class Main {
    public static void main(String[] args) {

        // Use this file for testing inputs.
        
        long startTime = System.currentTimeMillis();
        int [] nums =  {1,3};
        Solution solution = new Solution();
        System.out.println("Output: " + solution.searchInsert(nums,3));
        System.out.println("Runtime in ms: " + (System.currentTimeMillis() - startTime) + "ms" );
    }
}
