package cond;

public class IfCondEx4 {
    public static void main(String[] args) {
        double rating = 7;

        if (rating <= 7) {
            System.out.println("영화 고질라를 추천합니다");
        } if (rating <= 8) {
            System.out.println("영화 토이 스토리를 추천합니다");
        } if (rating <= 9) {
            System.out.println("영화 어바웃타임을 추천합니다");
        }
    }
}
