package project_0423.practice3;

public class Coffee {

    // 속성 = 변수
    private String name;    // 커피 이름
    private String size;    // 크기 (Tall, Grande, Venti, Trenta)
    private int price;      // 가격

    // 생성자 - 객체 조립설명서
    // 1. 클래스 이름과 동일
    // 2. 반환 데이터 타입 존재 x
    // 3. 여러개 존재 o

    // 기본 생성자

    public Coffee() {
        this.name = "아메리카노";
        this.size = "Tall";
        this.price = 4700;
    }

    public Coffee(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    // 기능 (메서드)
    public void order() {
        // 특별한 경우 체크
        if (size.equals("Trenta") && name.equals("자몽허니블랙티")) {
            System.out.println("그만마셔!");
        } else {
            System.out.println(size + " 사이즈의 " + name + "를 주문했습니다!");
        }
    }

    public void printPrice() { //이름 설정 어떻게 해야할지 잘 몰라서 검색해봤음
        System.out.println("가격은 " + price + "원 입니다.");
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 게터
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
