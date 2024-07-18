import java.util.HashSet;

public class pro12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> usedWords = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                char lastChar = words[i - 1].charAt(words[i - 1].length() - 1);
                char firstChar = words[i].charAt(0);
                if (lastChar != firstChar) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
            if (usedWords.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            usedWords.add(words[i]);
        }
        return answer;
    }
}
