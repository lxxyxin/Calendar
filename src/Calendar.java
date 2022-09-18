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

    public void printSelectDayCalendar(int year, int month, String day) {
        System.out.printf("    %4d년%3d월   \n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println(" -------------------");

        int maxDay = getMaxDaysOfMonth(year, month);
        int startDay = 0;
        int col=1;
        switch (day) {
            case "SU":
                startDay = 0;
                break;
            case "MO":
                startDay = 1;
                break;
            case "TU":
                startDay =2;
                break;
            case "WE":
                startDay =3;
                break;
            case "TH":
                startDay =4;
                break;
            case "FR":
                startDay =5;
                break;
            case "SA":
                startDay =6;
                break;
            default:
                break;
        }
        for (int space=0;space<startDay;space++){
            String blank = " ";
            System.out.printf("%3s",blank);
            col++;
        }
        for(int printDay = 1;printDay<=maxDay;printDay++){
            System.out.printf("%3d",printDay);
            col++;
            if(col>7){
                System.out.println();
                col =1;
            }
        }
        System.out.println();
    }

}
