package project_0423.ky;

public class Character {
    // 속성 = 변수로 표현할 수 있다.
    // 이름
    // 변수구조
    // [자료형] [변수이름]

    // 자주쓰는 자료형
    // int : 정수(숫자)
    // String : 문자열
    // boolean : 논리(true, false)

    private String name;
    private int age;
    private boolean isAdult;


    // 생성자 - 객체의 조립설명서
    // 1. 클래스 이름과 동일하다
    // 2. 반환 데이터 타입이 존재하지 않는다. (중요)
    // 3. 여러개 존재할 수 있다.
    // 기본생성자
    public Character() {

    }

    public Character(String name, int age, boolean isAdult) {
        // 접근할 수 있는 변수의 개수 = 6개
        // this.name;
        // this.age;
        // this.isAdult;
        // name;
        // age;
        // isAdult;


        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }


    // 기능 = 메서드
    // 반환자료형 기능이름() {
    //     작업내용
    // }

    //춤
    public void /*반환 데이터 타입*/ dance() {
        String name = this.name;
        System.out.println(name + "이(가) 춤을 춥니다.");
    }

    // 사냥
    public String hunt(String target) {
        return target + "을 사냥합니다.";
    }

    public int sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("result = " + result);
        return result;

    }

    // 세터(setter) 활용
    public void setName(String name) {
        // 제어 로직 추가 가능
        if(name.equals("볼트모트")) {
            System.out.println("설정할 수 없는 이름입니다.");
        }else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }


    // 게터(getter) 활용
    // 정보 조회하는 기능

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsAdult() {
        return isAdult;
    }

}
