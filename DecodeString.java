public class decodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString.toString());
                currentString = new StringBuilder();
                k = 0;
            } 
            else if (ch == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decoded = new StringBuilder(stringStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(currentString);
                }
                currentString = decoded;
            } 
            else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args){
        System.out.println(decodeString("3[a]2[bc]")); 
    }
}