import java.util.PriorityQueue;

public class pro42626 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int s : scoville) {
            minHeap.add(s);
        }

        int answer = 0;

        while (minHeap.peek() < K) {
            if (minHeap.size() < 2) {
                return -1;
            }
            int first = minHeap.poll();
            int second = minHeap.poll();
            int newScoville = first + (second * 2);

            minHeap.add(newScoville);
            answer++;
        }

        return answer;
    }
}
