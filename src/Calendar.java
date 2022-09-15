import java.util.Scanner;
public class Calendar {
    //private final int[] MaxDaysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    //public int GetMaxDaysOfMonth(int month){
      //  return MaxDaysOfMonth[month -1];
    //}
    public void GetCalendar(int month) {
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("------------------");

        if (month == 2) {
            System.out.println("1  2  3  4  5  6  7");
            System.out.println("8  9 10 11 12 13 14");
            System.out.println("15 16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
        } else if (month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("1  2  3  4  5  6  7");
            System.out.println("8  9 10 11 12 13 14");
            System.out.println("15 16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
            System.out.println("29 30 31");
        } else {
            System.out.println("1  2  3  4  5  6  7");
            System.out.println("8  9 10 11 12 13 14");
            System.out.println("15 16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
            System.out.println("29 30");
        }
    }

    public static void main(String[] args) {

        //숫자를 입력받아 해당하는 달의 달력 출력
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        String PROMPT = "CAL> ";

        while (true) {
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            if (month == -1){
                break;
            }
            if (month >12){
                continue;
            }
            cal.GetCalendar(month);
        }
        System.out.println("Bye~");
        scanner.close();
    }
}
