package codingbat;

public class Warmup1 {

    public static void main(String[] args) {
        //String str = "o";
        //Integer res = intMax(1, 2, 3);
        //Integer res = close10(13, 7);
        //Boolean res = in3050(40, 50);
        Integer res = max1020(10, 21);
        System.out.println(res.toString());
    }

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
        
        if ((a >= 10 && a <= 20) && a > b ) {
            return a;
        }
        if (b > a && (b >= 10 && b <= 20)) {
            return b;
        }
        return 0;
    }
}
