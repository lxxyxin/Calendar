import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        System.out.println("두 수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String s1, s2;

        s1 = scanner.next();
        s2 = scanner.next();

        int first = Integer.parseInt(s1);
        int second = Integer.parseInt(s2);

        int result = first + second;
        System.out.println("두 수의 합은 " + result + "입니다.");
    }
}
