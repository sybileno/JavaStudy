package cond;

public class IfCondGradeEx1 {
    public static void main(String[] args) {

        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성공입니다");
            case "B":
                System.out.println("망했습니다");
            case "C":
                System.out.println("심각하게 망했습니다");
            case "D":
                System.out.println("어이없습니다");
        }
    }
}