package array;

import java.util.Scanner;

public class ProgramEx1 {
    public static void main(String[] args) {

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCounts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 상품 등록 | 2.상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1) {
                if (productCounts >= maxProducts) {
                    System.out.println("더이상 상품을 등록할 수 없습니다");
                    continue;
                }
                System.out.println("상품 이름을 입력하세요:");
                productNames[productCounts] = scanner.nextLine();
                System.out.println("상품 가격을 입력하세요:");
                productPrices[productCounts] = scanner.nextInt();
                System.out.println("상품 갯수를 입력하세요:");
                productCounts++;

            } else if (select == 2) {
                if (productCounts == 0) {
                    System.out.println("등록된 물품이 없습니다.");
                    continue;
                }
                for(int i = 0; i < productCounts ; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }}
            else if (select == 3) {
                break;
            }else {
                System.out.println("잘못된 입력입니다");

            }

        }

    }}


