import java.util.Arrays;

public class pro12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget >= 0) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
