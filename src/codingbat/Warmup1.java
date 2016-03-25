package codingbat;

public class Warmup1 {

    public static String missingChar(String str, int n) {
        StringBuilder str1 = new StringBuilder(str);
        str = (str1.deleteCharAt(n)).toString();
        return str;
    }

    public static String frontBack(String str) {
        if (str.length() == 0) {
            return "";
        }
        char a1, a2;
        StringBuilder str1 = new StringBuilder(str);
        a1 = str.charAt(0);
        a2 = str.charAt(str.length() - 1);
        str1.setCharAt(0, a2);
        str1.setCharAt(str.length() - 1, a1);
        str = str1.toString();
        return str;
    }

    public static String front3(String str) {
        if (str.length() == 1) {
            return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);
        }
        if (str.length() == 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        if (str.length() > 2) {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
        return "";
    }

    public static String backAround(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
        } else if (str.length() == 1) {
            return str + str + str;
        }
        return "";
    }

    public static boolean or35(int n) {
        return ((n % 3) == 0) || ((n % 5) == 0);
    }

    public static String front22(String str) {
        if (str.length() == 1) {
            return str + str + str;
        }
        if (str.length() > 1) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
        return "";
    }

    public static boolean startHi(String str) {
        if (str.length() > 1) {
            return ("hi".equals(str.substring(0, 2)));
        }
        return false;
    }

    public static String delDel(String str) {
        StringBuilder str1 = new StringBuilder(str);
        if (str.length() > 3) {
            if ("del".equals(str.substring(1, 4))) {
                return (str1.delete(1, 4)).toString();
            } else {
                return str;
            }
        } else {
            return str;
        }
    }

    public static String startOz(String str) {
        if (str.length() > 0) {
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == 'o' && str.charAt(k + 1) == 'z' && (k+1)<str.length()) {
                    return "oz";
                }
                if (str.charAt(k) == 'o' && str.charAt(k + 1) != 'z') {
                    return "o";
                }
                if (str.charAt(k) == 'z') {
                    return "z";
                }
            }
        }
        return "";
    }
}