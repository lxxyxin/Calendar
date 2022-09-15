public class Calendar {
    private static final int[] Max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] Leap_Max_Days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int year, int month) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return Leap_Max_Days[month - 1];
        } else {
            return Max_Days[month - 1];
        }
    }

    public void printCalendar(int year, int month) {
        System.out.printf("    %4d년%3d월   \n", year, month);
        System.out.println("  일 월 화 수 목 금 토");
        System.out.println(" -------------------");

        int maxDay = getMaxDaysOfMonth(year, month);

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}
