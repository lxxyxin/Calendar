import java.util.Scanner;

public class Prompt {

    public void runPrompt(){
        //숫자를 입력받아 해당하는 달의 달력 출력
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        while (true) {
            System.out.println("연도을 입력하세요.");
            System.out.print("YEAR> ");
            int year = scanner.nextInt();
            System.out.println("달을 입력하세요.");
            System.out.print("MONTH> ");
            int month = scanner.nextInt();

            if (month == -1){
                break;
            }
            if (month >12){
                continue;
            }
            cal.printCalendar(year,month);
        }
        System.out.println("Bye~");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
