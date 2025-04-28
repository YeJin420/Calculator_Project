package project_0423.practice1;

public class Icecream {

    // 속성 = 변수
    private String flavor;
    private int price;

    //생성자 - 조립설명서
    // 1. 클래스 이름과 동일
    // 2. 반환데이터 타입 존재x
    // 3. 여러개 존재o

    public Icecream(String flavor, int price) {
        this.flavor = flavor;
        this.price = price;
    }

    // 기능
    public void exPrice() {
        System.out.println("이 아이스크림은 " + price + "원 입니다");
    }

    public void exFlavor() {
        System.out.println("이 아이스크림은 " + flavor + "맛 입니다");
    }

    //세터
    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getexFlavor() {
        return flavor;
    }

    public int getexPrice() {
        return price;

    }
}