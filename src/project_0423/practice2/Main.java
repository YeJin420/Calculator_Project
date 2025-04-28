package project_0423.practice2;

public class Main {
    public static void main(String[] args) {
        // 속성
        // 생성자
        // 기능

        Song song1 = new Song();
        song1.play();

        Song song2 = new Song();
        song2.play();

        song1.setTitle("Higher");
        song1.setSinger("비투비");

        System.out.println("수정된 제목 : " + song1.getTitle());
        System.out.println("수정된 가수 : " + song2.getSinger());

        song1.play();
        song2.play();

    }



}
