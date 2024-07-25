public class pro42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = brown + yellow;
        int i = 1;

        while (true) {
            if (a % i == 0) {
                answer[0] = i;
                answer[1] = a / i;
                if (answer[0] >= answer[1] && (answer[0] - 2) * (answer[1] - 2) == yellow) {
                    break;
                }
            }
            i++;
        }
        return answer;
    }
}
