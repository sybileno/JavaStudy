package cond;

public class IfCondEx3 {
    public static void main(String[] args) {

        int dollar = 31;
        int won = dollar * 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다");
        } if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } if (dollar > 0) {
            System.out.println("환전 금액은 " + won + " 원입니다");

        }
    }
}
