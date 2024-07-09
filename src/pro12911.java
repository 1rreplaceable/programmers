public class pro12911 {
    public int solution(int n) {
        int cntN = Integer.bitCount(n);
        while (true) {
            n++;
            if (Integer.bitCount(n) == cntN) {
                return n;
            }
        }
    }
}
