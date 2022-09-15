import java.sql.SQLOutput;
import java.util.Scanner;
public class Calendar {
    private final int[] MaxDaysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int GetMaxDaysOfMonth(int month){
        return MaxDaysOfMonth[month -1];
    }
    public static void main(String[] args) {

        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        String PROMPT = "CAL> ";

        int month = 1;
        while (true) {
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            month = scanner.nextInt();
            if (month == -1){
                break;
            }
            if (month >12){
                continue;
            }
            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.GetMaxDaysOfMonth(month));
        }
        System.out.println("Have a nice day!");
        scanner.close();
    }
}
