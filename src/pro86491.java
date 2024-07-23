public class pro86491 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int most_bigger = 0;
        int most_smaller = 0;
        for (int i = 0; i < sizes.length; i++) {
            int bigger = Math.max(sizes[i][0], sizes[i][1]);
            int smaller = Math.min(sizes[i][0], sizes[i][1]);
            most_bigger = Math.max(bigger, most_bigger);
            most_smaller = Math.max(smaller, most_smaller);
        }
        answer = most_bigger * most_smaller;
        return answer;
    }
}
