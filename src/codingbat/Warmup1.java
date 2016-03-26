package codingbat;

public class Warmup1 {

    public static String startOz(String str) {
        if (str.length() == 1) {
            if (str.charAt(0) == 'o') {
                return "o";
            }
        } else if (str.length() > 0) {
            if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
                return "oz";
            }
            if (str.charAt(0) == 'o') {
                return "o";
            }
        }
        if (str.length() > 1) {
            if (str.charAt(1) == 'z') {
                return "z";
            }
        }
        return "";
    }

    public static int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        }
        return 0;
    }

    public static int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        }
        return 0;
    }

    public static boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        }
        if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public static int max1020(int a, int b) {

        if ((a >= 10 && a <= 20) && a > b) {
            return a;
        }
        if (b > a && (b >= 10 && b <= 20)) {
            return b;
        }
        return 0;
    }

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

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public static boolean lastDigit(int a, int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        return strB.charAt(strB.length() - 1) == strA.charAt(strA.length() - 1);
    }

    public static String endUp(String str) {
        if (str.length() > 0) {
            if (str.length() > 3) {
                return str.substring(0, str.length() - 3)
                        + str.substring(str.length() - 3, str.length()).toUpperCase();
            }
            return str.toUpperCase();
        }
        return "";
    }

    public static String everyNth(String str, int n) {
        int k = 0;
        String res="";
        if (str.length() > 0) {
            do {
                res=res+str.charAt(k);
                k = k + n;
            } while (k < str.length());
            return res;
        }
        return "";
    }

}
