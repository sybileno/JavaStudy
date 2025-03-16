package scanner;

import java.util.Scanner;

public class ScannerExFinal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalCost = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결재, 3 : 프로그램 종료");
            int option = scanner.nextInt();
            if (option == 1) {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요 ");
                String productName = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 ");
                int productPrice = scanner.nextInt();
                System.out.print("결재 수량을 입력하세요 ");
                int productQuantity = scanner.nextInt();

                totalCost += productPrice * productQuantity;
                System.out.println("상품명: " + productName + "결재 수량 :" + productQuantity + " 결재 가격 :" + totalCost);
            }
            else if (option == 2) {
                System.out.println("총 결재 금액은 " + totalCost + "원 입니다");
                totalCost = 0;
            }
            else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
            break; }


            }
        }
    }
