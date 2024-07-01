import java.util.Scanner;
import java.util.*;
public class pro1845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        a = a.substring(1, a.length() - 1);
        String[] parts = a.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        int answer = solution(nums);
        System.out.println(answer);
        sc.close();
    }
    public static int solution(int[] nums) {
        int answer = 0;
        int pickNums = nums.length / 2;
        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums) {
            set.add(num);
        }
        if(pickNums < set.size()) {
            answer = pickNums;
        }else {
            answer = set.size();
        }

        return answer;
    }
}
