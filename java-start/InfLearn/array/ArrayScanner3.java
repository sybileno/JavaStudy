package array;

import java.util.Scanner;

public class ArrayScanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("입력받을 숫자의 갯수를 입력하세요");
        input = scanner.nextInt();
        int[] numbers = new int[input];
        int sum = 0;
        double average;

        System.out.println(input + "개의 정수를 입력하세요");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / numbers.length;
        System.out.println(sum);
        System.out.println(average);

        }

}