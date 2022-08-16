public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        String result = ++dayTest + CONCATENATION + monthTest + CONCATENATION + yearTest;
        return result;
    }
}
