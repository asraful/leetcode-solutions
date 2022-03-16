package leetcode;

public class SolutionTest {
    public static void main(String args[]) {
//        int nums[] = {1, 1, 0, 1, 1, 1};

        int nums[] = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1};

       int res =  new SolutionConsecutiveOnes().findMaxConsecutiveOnes(nums);

        System.out.println(res);
    }
}
