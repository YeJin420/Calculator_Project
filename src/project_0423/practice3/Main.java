package project_0423.practice3;

public class Main {

    // 속성
    // 생성자
    // 기능
    public static void main(String[] args) {
        // 기본 생성자 사용
        Coffee coffee1 = new Coffee();
        coffee1.order();
        coffee1.printPrice();


        // 매개변수 생성자 사용
        Coffee coffee2 = new Coffee("아메리카노", "Tall", 4700);
        coffee2.order();
        coffee2.printPrice();

        // 트렌타 자몽허니블랙티 주문 (단거 그만마셔,,)
        Coffee coffee3 = new Coffee("자몽허니블랙티", "Trenta", 5900);
        coffee3.order();
        coffee3.printPrice();

        // 세터
        coffee1.setName("오트 콜드 브루");
        coffee1.setSize("Tall");
        coffee1.setPrice(6000);

        // 수정한 값 출력
        System.out.println("수정된 커피 이름 : " + coffee1.getName());
        System.out.println("수정된 커피 크기 : " + coffee1.getSize());
        System.out.println("수정된 커피 가격 : " + coffee1.getPrice() + "원");

        // 수정된 커피 주문
        coffee1.order();
        coffee1.printPrice();
    }
}



// 아메리카노 4,700원
// 오트 콜드 브루 6,000원
// 자몽 허니 블랙 티(톨) 5,900원