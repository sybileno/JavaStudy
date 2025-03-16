package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해주세요");
        int num1 = scanner.nextInt();
        int num2 = 1;

        while (num2 <= 9) {
            System.out.println(num1 +  "*" + num2 + "=" +  num1 * num2 );
            num2++;
        }
    }
}
