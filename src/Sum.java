import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        System.out.println("두 수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        String[] splitedValue = inputValue.split(" ");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        int result = first + second;
        System.out.println("두 수의 합은 " + result + "입니다.");
    }
}
