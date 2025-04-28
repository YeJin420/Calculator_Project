package project_0423.practice5;

public class Pet {
    // 속성
    private String name;    // 펫 이름
    private String type;    // 종류 (강아지, 고양이 등)
    private String owner;   // 주인 이름


    // 생성자 - 객체 조립설명서
    // 1. 클래스 이름과 동일
    // 2. 반환 데이터 타입 존재 x
    // 3. 여러개 존재 o



    // 기본 생성자
    public Pet() {
        this.name = "이름 없음";
        this.type = "종류 없음";
        this.owner = "주인 없음";
    }

    // 매개변수 생성자
    public Pet(String name, String type, String owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    // 기능
    public void checkIn() {
        System.out.println(owner + "님의 " + type + " " + name + "가(이) 호텔에 체크인했습니다!");
    }

    public void checkOut() {
        System.out.println(owner + "님의 " + type + " " + name + "가(이) 호텔에서 체크아웃했습니다!");
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 게터
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }
}
