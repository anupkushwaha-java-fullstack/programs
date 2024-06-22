public class SearchInString {

    public static void main(String[] args) {
        String str = "Kushwaha";
        char target = 'h';
        int answer = linearSearch(str,target);

        int answerElement = linearSearchReturnElement(str,target);
        boolean isPresent = linearSearchReturnBoolean(str,target);

        System.out.println("Answer Index ::"  + answer);
        System.out.println("Answer Element:: "  + answerElement);
        System.out.println("Answer is Present :: "  + isPresent);
    }

    public static int linearSearch(String str , char target) {

        if (str.length() == 0) {
            return -1;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return index;
            }
        }
        return -1;
    }

    public static int linearSearchReturnElement(String str , int target) {

        if (str.length() == 0) {
            return -1;
        }

        for (char element : str.toCharArray()) {
            if ( element == target) {
                return element;
            }
        }
        return -1;
    }
    public static boolean linearSearchReturnBoolean(String str , int target) {

        if (str.length() == 0) {
            return false;
        }

        for (char element : str.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
