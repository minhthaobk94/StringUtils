package utils;

public final class StringUtils {


    private StringUtils() {

    }

    /*
    Compare 2 strings.
     */
    public static boolean equals(final String str1, final String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        return str1.equals(str2);
    }

    /*
    Compare 2 strings without case.
     */
    public static boolean equalsIgnoreCase(final String str1, final String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        return str1.equalsIgnoreCase(str2);
    }

    /*
    Compare 2 strings after cutting all space at top and bottom of string.
     */
    public static boolean equalsWithTrim(final String str1, final String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        return (str1.trim()).equals(str2.trim());
    }

    /*
    Compare 2 strings without case after cutting all space at top and bottom of string.
     */
    public static boolean equalsIgnoreCaseWithTrim(final String str1, final String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        return (str1.trim()).equalsIgnoreCase(str2.trim());
    }

    /*
    Check string is empty or not
     */
    public static boolean isEmpty(final String str) {
        return str.trim().length() == 0;
    }

    /*
    Check string has content or not
     */
    public static boolean hasContent(final String str) {
        return !(str.trim().length() == 0);
    }

    /*
    Evaluate length of string
     */
    public static int length(final String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    /*
    Evaluate length of string after cutting all space at top and bottom of string.
     */
    public static int trimLength(final String str) {
        if (str == null) {
            return 0;
        }
        return str.trim().length();
    }

    /*
    Show the last index of char input.
     */
    public static int lastIndexOf(String path, char c) {
        if (path == null) {
            return -1;
        }
        return path.lastIndexOf(c);
    }

    /*
    Count times of char input is repeated in string.
     */
    public static int count (String str, char c) {
        if (isEmpty(str)) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }



}
