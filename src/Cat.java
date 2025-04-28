public class Cat {
    // 1. 속성 - 변수로 표현할 수 있습니다!
    String name;
    int age;
    boolean isHungry;

    // 2. 생성자 - 조립설명서
    // 생성자 특징
    // 1) 클래스와 이름이 똑같다.
    // 2) 반환 데이터 타입이 존재하지 않는다.
    // 3) 여러개가 존재할 수 있습니다.
    // 기본생성자
    Cat() {}


    Cat(String name) {
        this.name = name;
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 기능(메서드)
    // 더하기
    // 오렌지 비유 ㅋㅋ,,
    // 메서드 선언부

    int sum (int value1, int value2) {
        int result = value1 + value2;
        return result;

    }



}
