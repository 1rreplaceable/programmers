import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pro42578 {
    public int solution(String[][] clothes) {
        HashMap<String, List<String>> clothesMap = new HashMap<>();
        for (String[] c : clothes) {
            clothesMap.computeIfAbsent(c[1], k -> new ArrayList<>()).add(c[0]);
        }
        int answer = 1;
        for (List<String> value : clothesMap.values()) {
            answer *= value.size() + 1;
        }
        return answer - 1;
    }
}
