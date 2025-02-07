
public class ReverseWordsInString
{
    public String ReverseWords(String s){
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString obj = new ReverseWordsInString();
        String s = "the sky is blue";
        String ans = obj.ReverseWords(s);

        System.out.println(ans);
    }
}
