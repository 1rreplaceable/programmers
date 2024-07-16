public class pro12903 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if (s.length() % 2 == 0) {
            answer = arr[arr.length / 2 - 1] + arr[arr.length / 2];
        } else {
            answer = arr[(arr.length - 1) / 2];
        }
        return answer;
    }
}
