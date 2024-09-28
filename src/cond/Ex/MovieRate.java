package cond.Ex;

public class MovieRate {
    public static void main(String[] args) {
        double rating = 8.7;
        if (rating > 9) {
            System.out.println("추천드릴 영화가 없습니다.");
        } else if (rating > 8) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } else if (rating > 7) {
            System.out.println("'어바웃타임'을 추천합니다");
            System.out.println("'토이 스토리'를 추천합니다");
        } else if (rating <= 7) {
            System.out.println("'어바웃타임'을 추천합니다");
            System.out.println("'토이 스토리'를 추천합니다");
            System.out.println("'고질라'를 추천합니다");
        }
    }
}
