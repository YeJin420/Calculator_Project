package project_0423.practice5;

public class Main {

    // 속성
    // 생성자
    // 기능

    public static void main(String[] args) {
        // 기본 생성자 사용
        Pet pet1 = new Pet();
        pet1.checkIn();

        //생성자 사용
        Pet pet2 = new Pet("미르", "강아지", "이예진");
        pet2.checkIn();

        //체크아웃
        pet2.checkOut();

        // 세터
        pet1.setName("마루");
        pet1.setType("고양이");
        pet1.setOwner("김기환");

        pet1.checkIn();
        pet1.checkOut();
    }
}
