package project_0423.ky;

public class Main {

    // 속성

    // 생성자

    // 기능
    public static void main(String[] args) {
        // JVM 메모리 영역
        // 1. 스택 Stack
        // 2. 힙 Heap
        // 3. 메서드 Method Area(static)

        // 클래스 -> 객체(인스턴스) : 객체화(인스턴스화)
        // 객체를 만들면 힙에 저장

        project_0423.ky.Character char1 = new project_0423.ky.Character();
        char1.dance();
        String target = char1.hunt("사슴");
        System.out.println("target = " + target);


        project_0423.ky.Character char2 = new Character("nameA", 1, true);
        char2.dance();
        int result = char2.sum(1,2);
        System.out.println("result = " + result);

        // 세터 활용
        char1.setName("gy");
        char1.setAge(30);
        char1.setIsAdult(true);
        char1.setName("볼트모트");


        // 게터 활용
        String get = char1.getName();
        System.out.println("get = " + get);

    }
}


// 숙제 : 상상하면서 해보기 !

// 1. 클래스 만들기(속생기)
// 2. 클래스의 속성 만들기
// 3. Main 에서 객체화 (x개 만들기)
// 4. JVM 메모리 영역 상상해보기
// 5. 생성자 x개 만들기 (생성자의 3가지 특징)
// 6. x개의 생성자를 통해 객체 만들어보기
// 7. JVM 메모리 영역 상상해보기
// 8. 어울리는 기능 만들기 (void, 반환데이터 존재하는 것 - return, 매개변수 활용)
// 9. 세터 만들기
// 10. 세터 활용 -> JVM 메모리 영역 생각해보기, 접근 제어 로직 넣어보기
// 11. 게터 만들기
// 12. 게터 활용
// 13. 게터 활용해서 데이터 조회한 것 출력해보기

