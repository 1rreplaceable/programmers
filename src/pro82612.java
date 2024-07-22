public class pro82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long money2 = 0;
        long p = 0;
        for (int i = 0; i < count; i++) {
            p = (long) price * (i + 1);
            money2 +=p;
        }
        answer = money2 > money ? money2 - money : 0;
        return answer;
    }
}
