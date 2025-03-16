package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        double num1 = 0;
        System.out.println("숫자를 입력하세요, 입력을 중단하려면 -1을 입력하세요");


        while (true) {
            num1 = input.nextInt();
            if (num1 == -1) {
                break;
            }
            sum += num1;
            count++;
        }

        double average = sum / count;
        System.out.println("총 합은 : " + sum + "입니다.");
        System.out.println("평균은 : " + average + "입니다");
    }
}
