package scanner;

import java.util.Scanner;

public class ChangeVarEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("이름을 입력하세요(종료를 입력하면 종료)");
            String 이름 = input.nextLine();

            if (이름.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("나이를 입력하세요:");
            int 나이 = input.nextInt();

            System.out.println("입력한 이름 : " + 이름 + "나이 : " + 나이);

        }
    }
}
