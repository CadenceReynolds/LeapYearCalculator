public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(200));

    }

    private static boolean isLeapYear(int year) {
        if (year > 0 && year<= 9999) {
            return div4Check(year);
        } else {
            return false;
        }
    }

    private static boolean div4Check(int year) {
        if (year % 4 == 0) {
            return div100Check(year);
        } else {
            return false;
        }
    }

    private static boolean div100Check(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return true;
        }
    }
}
