import java.util.PriorityQueue;

public class pro42628 {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (String operation : operations) {
            String[] arr = operation.split(" ");
            if (arr[0].equals("l")) {
                minHeap.add(Integer.parseInt(arr[1]));
                maxHeap.add(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("D")) {
                if (!minHeap.isEmpty() && arr[1].equals("1")) {
                    minHeap.remove(-maxHeap.poll());
                } else if (!minHeap.isEmpty() && arr[1].equals("-1")){
                    maxHeap.remove(-minHeap.poll());
                }
            }
        }
        answer = minHeap.isEmpty() ? new int[] {0, 0} : new int[] {-maxHeap.poll(), minHeap.poll()};
        return answer;
    }
}
