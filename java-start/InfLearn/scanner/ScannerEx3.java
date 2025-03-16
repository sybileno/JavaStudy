package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음식의 이름을 입력하세요");
        String foodName = scanner.nextLine();

        System.out.println("음식의 가격을 입력해주세요");
        double foodPrice = scanner.nextDouble();

        System.out.println("음식의 수량을 입력해주세요");
        int foodQuantity = scanner.nextInt();

        double totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + foodQuantity + "개를 주문하셨습니다, 총 가격은" + totalPrice + "입니다.  앞에서 결재해주시기 바랍니다.");
    }
}
