import java.util.Arrays;

public class pro12953 {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        while(true) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max % arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt == arr.length) {
                answer = max;
                break;
            }
            max++;
        }
        return answer;
    }
}
