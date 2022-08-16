public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static final String FIRSTOFMONTH = "1";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        String result;
        int lastOfMonth = 31;
        if (dayTest== lastOfMonth){
            result = FIRSTOFMONTH + CONCATENATION + (++monthTest) + CONCATENATION + yearTest;
        }
        else {
            result = ++dayTest + CONCATENATION + monthTest + CONCATENATION + yearTest;
        }
        return result;
    }
}
