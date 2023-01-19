public class Question2 {

    public static void main(String[] args) {

    }


    public static boolean isSpecialString (String str) {
        boolean special = true;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (countCharInText(str, current) != countCharInText(str, toggleCase(current))) {
                special = false;
                break;
            }
        }
        return special;
    }

    public static int countCharInText (String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String mostSpecialString (String[] strings, char find) {
        String mostSpecialString = null;
        for (int i = 0; i < strings.length; i++) {
            if (isSpecialString((strings[i]))) {
                if (mostSpecialString == null || (countCharInText(strings[i], find) > countCharInText(mostSpecialString, find))) {
                    mostSpecialString = strings[i];
                }

            }
        }
        return mostSpecialString;
    }

    public static char toggleCase (char c) {
        char result;
        String charAsString = c + "";
        if (charAsString.toLowerCase().equals(charAsString)) {
            result = charAsString.toUpperCase().charAt(0);
        } else {
            result = charAsString.toLowerCase().charAt(0);
        }
        return result;
    }
}
