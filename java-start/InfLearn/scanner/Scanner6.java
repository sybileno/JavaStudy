package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("사용자가 0을 입력하면 종료됩니다");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("합은 " + sum);
    }
}