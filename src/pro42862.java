import java.util.Arrays;

public class pro42862 {

    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        System.out.println(solution(n, lost, reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int j : lost) {
            arr[j - 1]--;
        }
        for (int j : reserve) {
            arr[j - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (i - 1 >= 0 && arr[i - 1] == 2) {
                    arr[i]++;
                    arr[i - 1]--;
                } else if (i + 1 < n && arr[i + 1] == 2) {
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }
        for (int a : arr) {
            if (a > 0) {
                answer++;
            }
        }
        return answer;
    }
}
