public class ReverseString {

    public static String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        return sb.toString();
    }
}
