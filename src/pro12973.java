public class pro12973 {
    public int solution(String s) {
        String k = s;
        boolean found = true;

        while (found) {
            found = false;
            for (int i = 0; i < k.length() - 1; i++) {
                if (k.charAt(i) == k.charAt(i + 1)) {
                    k = k.substring(0, i) + k.substring(i + 2);
                    found = true;
                    break;
                }
            }
        }
        return k.length() == 0 ? 1 : 0;
    }
}
//public int solution(String s) {
//    StringBuilder k = new StringBuilder(s);
//
//    for (int i = 0; i < k.length() - 1; i++) {
//        if (k.charAt(i) == k.charAt(i + 1)) {
//            k.delete(i, i + 2);
//            i = -1;
//        }
//    }
//
//    return k.length() == 0 ? 1 : 0;
//}

//public int solution(String s) {
//    Stack<Character> stack = new Stack<Character>();
//    for(char ch : s.toCharArray()) {
//        if(stack.isEmpty()) {
//            stack.push(ch);
//        } else {
//            if(stack.peek() == ch) {
//                stack.pop();
//            } else {
//                stack.push(ch);
//            }
//        }
//    }
//
//    return stack.isEmpty() ? 1 : 0;
//}